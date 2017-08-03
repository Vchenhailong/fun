package bo;

import enums.RestRecipeRelationStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestRecipeRelationDomain {
	
	private Integer id;
	
	private Integer restaurantId;
	
	private Integer recipeId;
	
	private int recipePrice;
	
	private RestRecipeRelationStatus status;
	
	private Integer created_tm;

	private Integer updated_tm;
	
	public boolean check(){
		if(restaurantId == null || recipeId == null){
			throw new RuntimeException("餐厅/菜单为空");
		}
		if(recipePrice < 0){
			throw new RuntimeException("单价必须不小于0元");
		}
		return true;
		}
	


}
