package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import api.RestaurantFacade;
import bo.RestaurantDomain;
import dao.RestaruantDao;

@Service
public class RestaurantFacadeImpl implements RestaurantFacade {
	@Autowired
	private RestaruantDao restaurantDao;

	public void createRestaurant(@RequestBody RestaurantDomain restaurant) {
		
		if(restaurant.getAddr() != null && restaurant.getRestaurantName() !=null && restaurant.getTel() != null){
			 restaurantDao.createRestaurant(restaurant);
	}
		else {
			System.out.println("餐厅名/地址/联系电话不能为空");
		}
}

	@Override
	public void updateRestaurant(RestaurantDomain restaurant) {
		// TODO Auto-generated method stub
		try{
			if( restaurant.getId() != null ){
				restaurantDao.updateRestaurant(restaurant);
			}else{
				System.out.println("餐厅id不存在");
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public RestaurantDomain queryRestaurant(RestaurantDomain restaurant) {
		// TODO Auto-generated method stub
		try{
			if( restaurant.getId() != null ){
				return restaurantDao.queryRestaurant(restaurant);
			}else{
				System.out.println("餐厅不存在");
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
}

	@Override
	public void deleteRestaurant(RestaurantDomain restaurant) {
		// TODO Auto-generated method stub
	}

	@Override
	public List<RestaurantDomain> getRestaurantList(RestaurantDomain restaurant) {
		try{
			return restaurantDao.getRestaurantList(restaurant);
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
}
