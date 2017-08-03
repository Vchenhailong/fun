package dao;

import java.util.List;

import bo.RestaurantDomain;

public interface RestaruantDao {

	void createRestaurant(RestaurantDomain restaurant);
	
	void updateRestaurant(RestaurantDomain restaurant);

	void deleteRestaurant(RestaurantDomain restaurant);

	RestaurantDomain queryRestaurant(RestaurantDomain restaurant);
	
	List<RestaurantDomain> getRestaurantList(RestaurantDomain restaurant);

}
