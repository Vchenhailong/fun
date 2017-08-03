package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.RecipeFacade;
import bo.RecipeDomain;
import dao.RecipeDao;

@Service
public class RecipeFacadeImpl implements RecipeFacade {
	@Autowired
	private RecipeDao recipeDao;

	@Override
	public void createRecipe(RecipeDomain recipeDomain) {

		try {
			if (recipeDomain.getRecipeName() != null && recipeDomain.getCategory() != null
					&& recipeDomain.getRecipeType() != null) {
				recipeDao.createRecipe(recipeDomain);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public RecipeDomain queryRecipe(RecipeDomain recipeDomain) {

		if (recipeDomain.getId() != null) {
			return recipeDao.queryRecipe(recipeDomain);
		}
		return null;

	}

	@Override
	public void updateRecipe(RecipeDomain recipeDomain) {

		if (recipeDomain.getId() != null) {

			// 更新前先查询数据是否存在
			RecipeDomain queryResult = recipeDao.queryRecipe(recipeDomain);
			if (queryResult == null) {
				throw new RuntimeException("根据菜谱id查询不到数据" + "");
			} else {
				recipeDao.updateRecipe(recipeDomain);
			}
		} else {
			throw new RuntimeException("菜谱id不存在" + "");
		}

	}

	@Override
	public void deleteRecipe(RecipeDomain recipeDomain) {

		try {
			if (recipeDomain.getId() != null) {
				recipeDao.deleteRecipe(recipeDomain);
			}
		} catch (Exception e) {
			System.out.println("菜谱不存在");
			e.printStackTrace();
		}

	}

	@Override
	public List<RecipeDomain> getAllRecipeList(RecipeDomain recipeDomain) {

		try {
//			if (recipeDomain.getId() != null || recipeDomain.getCategory() != null
//					|| recipeDomain.getRecipeName() != null || recipeDomain.getRecipeType() != null) {
				 return recipeDao.getAllRecipe(recipeDomain);
//			}
		} catch (Exception e) {
			System.out.println("菜谱不存在");
			e.printStackTrace();
		}
		return null;

	}

}
