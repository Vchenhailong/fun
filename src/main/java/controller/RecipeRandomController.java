package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import api.RecipeFacade;
import api.RecipeRandomFacade;
import base.response.Response;
import bo.RecipeRandomDomain;

@Controller
@RequestMapping("/")
public class RecipeRandomController {

	@Autowired
	private RecipeRandomFacade recipeRandomFacade;

	@ResponseBody
	@RequestMapping("/getRandomResult.do")
	public Response getRecipeRandom(@RequestBody RecipeRandomDomain recipeRandomDomain) {

		try {
			if (recipeRandomDomain.getRecipeId() != null || recipeRandomDomain.getPersonNum() >= 1
					|| recipeRandomDomain.getRestaurantId() != null) {
				return new Response(recipeRandomFacade.getRecipeRandom(recipeRandomDomain));
			}

		} catch (Exception e) {
			e.printStackTrace();
			return new Response("R0001", "无数据");
		}
		return new Response("99999", "未知错误");
	}

}
