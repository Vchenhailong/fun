package bo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantDomain {

	private Integer id;
	//名称
	private String restaurantName;
	//地址
	private String addr;
	//联系电话
	private String tel;
	//标签
	private String tag;
	//坐标
	private String location;
	
	private Date created_tm;
	
	private Date updated_tm;
}
