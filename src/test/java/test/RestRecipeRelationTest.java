package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import api.RestRecipeRelationFacade;
import bo.RestRecipeRelationDomain;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/application.xml" })
public class RestRecipeRelationTest {

	@Autowired
	private RestRecipeRelationFacade restRecipeRelationFacade;

	// 新增关联数据
	@Test
	public void createRestRecipeRelationTest() {

		RestRecipeRelationDomain restRecipeRelationDomain = new RestRecipeRelationDomain();
		restRecipeRelationDomain.setRecipeId(2);
		restRecipeRelationDomain.setRecipePrice(1);
		restRecipeRelationDomain.setRestaurantId(4);
		restRecipeRelationFacade.createRestRecipeRelation(restRecipeRelationDomain);
	}

	// 更新关联数据
	@Test
	public void updateRestRecipeRelationTest() {
		RestRecipeRelationDomain restRecipeRelationDomain = new RestRecipeRelationDomain();
		restRecipeRelationDomain.setId(1);
		restRecipeRelationDomain.setRecipePrice(1);
		restRecipeRelationFacade.updateRestRecipeRelation(restRecipeRelationDomain);
	}
	
	// 查询关联数据
	@Test
	public void queryRestRecipeRelationTest() {
		RestRecipeRelationDomain restRecipeRelationDomain = new RestRecipeRelationDomain();
		restRecipeRelationDomain.setId(1);
		restRecipeRelationFacade.queryRestRecipeRelation(restRecipeRelationDomain);
	}
	
	// 删除关联数据
	@Test
	public void deleteRestRecipeRelationTest() {
		
	}
}
