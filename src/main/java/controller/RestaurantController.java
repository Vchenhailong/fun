package controller;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import api.RestaurantFacade;
import base.response.Response;
import bo.RestaurantDomain;

@RestController
@RequestMapping("/")
public class RestaurantController {
	// 自动装配，controller调用服务api
	@Autowired
	private RestaurantFacade restaurantFacade;

	@RequestMapping(value = "/createRestaurant.do")
	@ResponseBody
	public Response createRestaurant(@RequestBody RestaurantDomain restaurant) {
		try {
			if (StringUtils.isBlank(restaurant.getRestaurantName()) || StringUtils.isBlank(restaurant.getAddr())
					|| StringUtils.isBlank(restaurant.getTel())) {
				return new Response("A0001","新增餐厅失败");
			}
			restaurantFacade.createRestaurant(restaurant);
			return new Response(null);
		} catch (Exception e) {
			e.printStackTrace();
			return new Response("99999","未知错误。原因是:"+e.getMessage());
		}
	}

	@RequestMapping("/updateRestaurant.do")
	@ResponseBody
	public void updateRestaurant(@RequestBody RestaurantDomain restaurant) {

		restaurantFacade.updateRestaurant(restaurant);

	}

	@RequestMapping("/queryRestaurant.do")
	@ResponseBody
	public RestaurantDomain queryRestaurant(@RequestBody RestaurantDomain restaurant) {

		return restaurantFacade.queryRestaurant(restaurant);

	}
	
	@RequestMapping("/getRestaurantList.do")
	@ResponseBody
	public List<RestaurantDomain> getRestaurantList(@RequestBody RestaurantDomain restaurant){
		return restaurantFacade.getRestaurantList(restaurant);
	}
}
