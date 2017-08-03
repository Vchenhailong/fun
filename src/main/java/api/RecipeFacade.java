package api;

import java.util.List;

import bo.RecipeDomain;

public interface RecipeFacade {
	
	void createRecipe(RecipeDomain recipeDomain);
	
	RecipeDomain queryRecipe(RecipeDomain recipeDomain);
	
	void updateRecipe(RecipeDomain recipeDomain);
	
	void deleteRecipe(RecipeDomain recipeDomain);
	
	List<RecipeDomain> getAllRecipeList(RecipeDomain recipeDomain);

}
