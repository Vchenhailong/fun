package api;

import bo.RestaurantDomain;

public interface RestaurantFacade {
	
	RestaurantDomain createRestaurant(RestaurantDomain restaurant);
	
	RestaurantDomain updateRestaurant(RestaurantDomain restaurant);
	
	RestaurantDomain queryRestaurant(RestaurantDomain restaurant);

	RestaurantDomain deleteRestaurant(RestaurantDomain restaurant);


}
