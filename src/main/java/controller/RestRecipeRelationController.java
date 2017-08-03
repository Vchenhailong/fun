package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import api.RestRecipeRelationFacade;
import base.response.Response;
import bo.RestRecipeRelationDomain;


@Controller
@RequestMapping("/")
public class RestRecipeRelationController {
		
	@Autowired
	private RestRecipeRelationFacade restRecipeRelationFacade;
	
	@RequestMapping("/createRestRecipeRelation.do")
	@ResponseBody
	public Response createRestRecipeRelation(@RequestBody RestRecipeRelationDomain restRecipeRelationDomain){
		
		try {
			restRecipeRelationFacade.createRestRecipeRelation(restRecipeRelationDomain);
			return new Response(null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Response("C0001", "关联失败，原因:"+e.getMessage());

		}
	}
	
	@RequestMapping("/updateRestRecipeRelation.do")
	@ResponseBody
	public void updateRestRecipeRelation(@RequestBody RestRecipeRelationDomain restRecipeRelationDomain){
		
		restRecipeRelationFacade.updateRestRecipeRelation(restRecipeRelationDomain);
		
	}
	
	@RequestMapping("/deleteRestRecipeRelation.do")
	@ResponseBody
	public void deleteRestRecipeRelation(@RequestBody RestRecipeRelationDomain restRecipeRelationDomain){
		
		restRecipeRelationFacade.deleteRestRecipeRelation(restRecipeRelationDomain);
		
	}
	
	@RequestMapping("/queryRestRecipeRelation.do")
	@ResponseBody
	public void queryRestRecipeRelation(@RequestBody RestRecipeRelationDomain restRecipeRelationDomain){
		
		restRecipeRelationFacade.queryRestRecipeRelation(restRecipeRelationDomain);

	}

}
