package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import api.RestaurantFacade;
import bo.RestaurantDomain;

@Controller
public class RestaurantController {
	//自动装配，controller调用服务api
	@Autowired
	private RestaurantFacade restaurantFacade;
	
	@RequestMapping("/createRestaurant.do")
	public void createRestaurant(RestaurantDomain restaurant){
		
		restaurantFacade.createRestaurant(restaurant);
	}
	
	@RequestMapping("/updateRestaurant.do")
	public void updateRestaurant(RestaurantDomain restaurant){
		
		restaurantFacade.updateRestaurant(restaurant);
		
	}
	@RequestMapping("/queryRestaurant.do")
	public RestaurantDomain queryRestaurant(RestaurantDomain restaurant){
		
		return restaurantFacade.queryRestaurant(restaurant);
		
		}
}
