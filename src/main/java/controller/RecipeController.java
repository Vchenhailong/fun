package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import api.RecipeFacade;
import bo.RecipeDomain;

@Controller
public class RecipeController {
	
	@Autowired
	private RecipeFacade recipeFacade;
	
	@RequestMapping("/createRecipe.do")
	public void createRecipe(RecipeDomain recipe){
		recipeFacade.createRecipe(recipe);
		}
	
	@RequestMapping("/deleteRecipe.do")
	public void deleteRecipe(RecipeDomain recipe){
		recipeFacade.deleteRecipe(recipe);
		}
	
	@RequestMapping("/queryRecipe.do")
	public RecipeDomain queryRecipe(RecipeDomain recipe){
		return recipeFacade.queryRecipe(recipe);
		}
	
	@RequestMapping("/updateRecipe.do")
	public void updateRecipe(RecipeDomain recipe){
		recipeFacade.queryRecipe(recipe);
		}

}
