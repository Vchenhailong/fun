package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import api.RestaurantFacade;
import bo.RestaurantDomain;

//使用标准的JUnit @RunWith注释来告诉JUnit使用Spring TestRunner  
@RunWith(SpringJUnit4ClassRunner.class)
//指定bean注入的配置文件  
@ContextConfiguration({"/application.xml"})
public class RestaurantTest {
	
	@Autowired
	private RestaurantFacade restaurantFacade;
	
	@Test
	// 参数符合时
	public void createRestaurantTest(){
		try{
		RestaurantDomain restaurantDomain = new RestaurantDomain();
		restaurantDomain.setRestaurant_name("炊烟时代");
		restaurantDomain.setAddr("taskin");
		restaurantDomain.setTel("13913913913");
		restaurantFacade.createRestaurant(restaurantDomain);
	}catch(Exception e){
		e.printStackTrace();
	}
	}
	
	@Test
	// 餐厅名称为空时
	public void noRestaurantNameTest(){
		try{
		RestaurantDomain restaurantDomain = new RestaurantDomain();
		restaurantDomain.setRestaurant_name(null);
		restaurantDomain.setAddr("taskin");
		restaurantDomain.setTel("13913913913");
		restaurantFacade.createRestaurant(restaurantDomain);
	}catch(Exception e){
		e.printStackTrace();
	}
	}
	
	@Test
	// 更新餐厅id
	public void updateRestaurantTest(){
		try{
			RestaurantDomain restaurantDomain = new RestaurantDomain();
			restaurantDomain.setId(1);
			restaurantDomain.setTel("13900000001");
			restaurantDomain.setRestaurant_name("new炊烟时代1");
			restaurantFacade.updateRestaurant(restaurantDomain);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Test
	public void queryRestaurantTest(){
		try{
			RestaurantDomain restaurantDomain = new RestaurantDomain();
			restaurantDomain.setId(1);
			RestaurantDomain result=restaurantFacade.queryRestaurant(restaurantDomain);
			System.out.println(result);
		}catch(Exception e){
			e.printStackTrace();
		}		
	}
}
