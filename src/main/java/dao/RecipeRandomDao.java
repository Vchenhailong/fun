package dao;

import java.util.List;

import bo.RecipeRandomDomain;

public interface RecipeRandomDao {
	
	List<RecipeRandomDomain> getRecipeRandom(RecipeRandomDomain recipeRandomDomain);

}
