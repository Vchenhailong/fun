package api;

import bo.RestRecipeRelationDomain;

public interface RestRecipeRelationFacade {
	
	void createRestRecipeRelation(RestRecipeRelationDomain restRecipeRelationDomain);
	
	void updateRestRecipeRelation(RestRecipeRelationDomain restRecipeRelationDomain);
	
	RestRecipeRelationDomain queryRestRecipeRelation(RestRecipeRelationDomain restRecipeRelationDomain);
	
	void deleteRestRecipeRelation(RestRecipeRelationDomain restRecipeRelationDomain);

}
