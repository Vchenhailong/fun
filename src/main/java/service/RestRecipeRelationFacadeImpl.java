package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.RestRecipeRelationFacade;
import bo.RecipeDomain;
import bo.RestRecipeRelationDomain;
import bo.RestaurantDomain;
import dao.RecipeDao;
import dao.RestRecipeRelationDao;
import dao.RestaruantDao;

@Service
public class RestRecipeRelationFacadeImpl implements RestRecipeRelationFacade {

	@Autowired
	private RestRecipeRelationDao restRecipeRelationDao;
	@Autowired
	private RestaruantDao restaruantDao;
	@Autowired
	private RecipeDao recipeDao;

	@Override
	// 创建餐厅与菜谱的关联
	public void createRestRecipeRelation(RestRecipeRelationDomain restRecipeRelationDomain) {

		try {
			restRecipeRelationDomain.check();

			RestaurantDomain restaurantDomain = new RestaurantDomain();
			restaurantDomain.setId(restRecipeRelationDomain.getRestaurantId());
			RestaurantDomain result1 = restaruantDao.queryRestaurant(restaurantDomain);
			if (result1 == null) {
				throw new RuntimeException("餐厅id不存在");
			}

			RecipeDomain recipeDomain = new RecipeDomain();
			recipeDomain.setId(restRecipeRelationDomain.getRecipeId());
			RecipeDomain result2 = recipeDao.queryRecipe(recipeDomain);
			if (result2 == null) {
				throw new RuntimeException("菜单id不存在");
			}

			restRecipeRelationDao.createRestRecipeRelation(restRecipeRelationDomain);

		} catch (Exception e) {
			throw new RuntimeException("参数错误");
		}

	}

	@Override
	// 更新餐厅与菜谱的关联
	public void updateRestRecipeRelation(RestRecipeRelationDomain restRecipeRelationDomain) {

		if (restRecipeRelationDomain.getId() == null) {
			throw new RuntimeException("数据不存在");
		}

		restRecipeRelationDao.updateRestRecipeRelation(restRecipeRelationDomain);

	}

	@Override
	// 查询餐厅与菜谱的关联
	public RestRecipeRelationDomain queryRestRecipeRelation(RestRecipeRelationDomain restRecipeRelationDomain) {
		
		if (restRecipeRelationDomain.getId() == null) {
			throw new RuntimeException("数据不存在");
		}
		return restRecipeRelationDao.queryRestRecipeRelation(restRecipeRelationDomain);
	}

	@Override
	// 删除餐厅与菜谱的关联
	public void deleteRestRecipeRelation(RestRecipeRelationDomain restRecipeRelationDomain) {
		
		if (restRecipeRelationDomain.getId() == null) {
			throw new RuntimeException("数据不存在");
		}

	}

}
