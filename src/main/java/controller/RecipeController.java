package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import api.RecipeFacade;
import base.response.Response;
import bo.RecipeDomain;

@Controller
@RequestMapping("/")
public class RecipeController {

	@Autowired
	private RecipeFacade recipeFacade;

	@RequestMapping("/createRecipe.do")
	@ResponseBody
	public Response createRecipe(@RequestBody RecipeDomain recipe) {
		try {
			recipeFacade.createRecipe(recipe);
			return new Response(null);
		} catch (Exception e) {
			e.printStackTrace();
			return new Response("B0001", "创建菜单失败，原因:"+e.getMessage());
		}
	}

	@RequestMapping("/deleteRecipe.do")
	@ResponseBody
	public Response deleteRecipe(@RequestBody RecipeDomain recipe) {
		try {
			recipeFacade.deleteRecipe(recipe);
			return new Response();
		} catch (Exception e) {
			e.printStackTrace();
			return new Response("B0002", "刪除菜单失败，原因:"+e.getMessage());
		}
	}

	@RequestMapping("/queryRecipe.do")
	@ResponseBody
	public Response queryRecipe(@RequestBody RecipeDomain recipe) {
		try {
			return new Response(recipeFacade.queryRecipe(recipe));
		} catch (Exception e) {
			e.printStackTrace();
			return new Response("B0003", "查詢菜单失败，原因:"+e.getMessage());
		}
	}

	@RequestMapping("/updateRecipe.do")
	@ResponseBody
	public Response updateRecipe(@RequestBody RecipeDomain recipe) {
		try {
			recipeFacade.updateRecipe(recipe);
			return new Response(null);
		} catch (Exception e) {
			e.printStackTrace();
			return new Response("B0004", "更新菜单失败，原因:"+e.getMessage());
		}
	}

	@RequestMapping("/getAllRecipeList.do")
	@ResponseBody
	public List<RecipeDomain> getAllRecipe(@RequestBody RecipeDomain recipe) {
		return recipeFacade.getAllRecipeList(recipe);

	}

}
