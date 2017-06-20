package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.RestaurantFacade;
import bo.RestaurantDomain;
import dao.RestaruantDao;

@Service
public class RestaurantFacadeImpl implements RestaurantFacade {
	@Autowired
	private RestaruantDao restaurantDao;

	public void createRestaurant(RestaurantDomain restaurant) {
		
		if(restaurant.getAddr() != null && restaurant.getRestaurant_name() !=null && restaurant.getTel() != null){
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
}
