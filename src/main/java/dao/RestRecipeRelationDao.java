package dao;

import bo.RestRecipeRelationDomain;

public interface RestRecipeRelationDao {
	
	void createRestRecipeRelation(RestRecipeRelationDomain restRecipeRelationDomain);
	
	void updateRestRecipeRelation(RestRecipeRelationDomain restRecipeRelationDomain);
	
	RestRecipeRelationDomain queryRestRecipeRelation(RestRecipeRelationDomain restRecipeRelationDomain);
	
	void deleteRestRecipeRelation(RestRecipeRelationDomain restRecipeRelationDomain);
	
	

}
