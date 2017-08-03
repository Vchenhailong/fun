package api;

import java.util.List;

import bo.RestaurantDomain;

public interface RestaurantFacade {
	
	void createRestaurant(RestaurantDomain restaurant);
	
	void updateRestaurant(RestaurantDomain restaurant);
	
	RestaurantDomain queryRestaurant(RestaurantDomain restaurant);

	void deleteRestaurant(RestaurantDomain restaurant);
	
	List<RestaurantDomain> getRestaurantList(RestaurantDomain restaurantDomain);

}
