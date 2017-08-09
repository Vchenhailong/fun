package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import api.RecipeRandomFacade;
import bo.RecipeRandomDomain;
import dao.RecipeRandomDao;

@Service
public class RecipeRandomFacadeImpl implements RecipeRandomFacade {

	@Autowired
	private RecipeRandomDao recipeRandomDao;

	@Override
	public List<RecipeRandomDomain> getRecipeRandom(@RequestBody RecipeRandomDomain recipeRandomDomain) {
		try {
			if (recipeRandomDomain.getPersonNum() >= 1 && recipeRandomDomain.getRestaurantId() != null) {
				// 计算点的菜数
				List<RecipeRandomDomain> recipeList = recipeRandomDao.getRecipeRandom(recipeRandomDomain); // 初始列表数据
				List<RecipeRandomDomain> finalList = new ArrayList<>();  // 随机产生的结果集
				Random rdm = new Random();
				for (int i = 0; i < recipeRandomDomain.getPersonNum(); i++) {
					int index = rdm.nextInt(recipeList.size());
					finalList.add(recipeList.remove(index));
				}
				return finalList;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
