package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import api.RecipeFacade;
import bo.RecipeDomain;
import enums.RecipeCategory;
import enums.RecipeType;

//使用标准的JUnit @RunWith注释来告诉JUnit使用Spring TestRunner  
@RunWith(SpringJUnit4ClassRunner.class)
//指定bean注入的配置文件  
@ContextConfiguration({"/application.xml"})
public class RecipeTest {
	
	@Autowired
	private RecipeFacade recipeFacade;
	
	// 创建菜谱
	@Test
	public void createRecipeTest(){
		
		RecipeDomain recipeDomain = new RecipeDomain();
		recipeDomain.setRecipeName("南城家院");
		recipeDomain.setCategory(RecipeCategory.soup);
		recipeDomain.setType(RecipeType.xiangcai);
		recipeFacade.createRecipe(recipeDomain);
	}
	
	// 查询菜谱
	@Test
	public void queryRecipe(){
		try{
			RecipeDomain recipeDomain = new RecipeDomain();
			recipeDomain.setId(2);
			RecipeDomain result = recipeFacade.queryRecipe(recipeDomain);
			System.out.println(result);
		}catch(Exception e){
			e.printStackTrace();
		}		
	}
	
	// 删除菜谱数据
	@Test
	public void deleteRecipe(){
		try{
			RecipeDomain recipeDomain = new RecipeDomain();
			recipeDomain.setId(1);
			recipeFacade.deleteRecipe(recipeDomain);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	// 菜谱ID不合法，更新数据
	@Test
	public void noIdUpdateRecipe(){
		try{
			RecipeDomain recipeDomain = new RecipeDomain();
			recipeDomain.setId(1);
			recipeDomain.setCategory(RecipeCategory.drinks);
			recipeFacade.updateRecipe(recipeDomain);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	// 更新菜谱数据
	@Test 
	public void updateRecipe(){
		try{
			RecipeDomain recipeDomain = new RecipeDomain();
			recipeDomain.setId(2);
			recipeDomain.setCategory(RecipeCategory.drinks);
			recipeFacade.updateRecipe(recipeDomain);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
