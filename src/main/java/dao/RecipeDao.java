package dao;


import java.util.List;

import bo.RecipeDomain;

public interface RecipeDao {
	
	RecipeDomain queryRecipe(RecipeDomain recipeDomain);
	
	void createRecipe(RecipeDomain recipeDomain);
	
	void updateRecipe(RecipeDomain recipeDomain);
	
	void deleteRecipe(RecipeDomain recipeDomain);
	
	List<RecipeDomain> getAllRecipe(RecipeDomain recipeDomain);

}
