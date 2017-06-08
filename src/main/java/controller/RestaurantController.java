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
	
	@RequestMapping("/createRestaurant")
	public RestaurantDomain createRestaurant(RestaurantDomain restaurant){
		
		return restaurantFacade.createRestaurant(restaurant);
	}
	
	@RequestMapping("/updateRestaurant")
	public RestaurantDomain updateRestaurant(RestaurantDomain restaurant){
		
		return restaurantFacade.updateRestaurant(restaurant);
		
	}
	@RequestMapping("/queryRestaurant")
	public RestaurantDomain queryRestaurant(RestaurantDomain restaurant){
		
		return restaurantFacade.queryRestaurant(restaurant);
		
		}
}
