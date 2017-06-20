package api;

import bo.RestaurantDomain;

public interface RestaurantFacade {
	
	void createRestaurant(RestaurantDomain restaurant);
	
	void updateRestaurant(RestaurantDomain restaurant);
	
	RestaurantDomain queryRestaurant(RestaurantDomain restaurant);

	void deleteRestaurant(RestaurantDomain restaurant);


}
