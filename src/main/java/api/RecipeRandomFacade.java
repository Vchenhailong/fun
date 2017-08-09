package api;

import java.util.List;

import bo.RecipeRandomDomain;

public interface RecipeRandomFacade {
	
	List<RecipeRandomDomain> getRecipeRandom(RecipeRandomDomain recipeRandomDomain);

}
