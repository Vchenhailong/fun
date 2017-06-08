package bo;

import java.util.Date;

import bo.RestaurantDomain.RestaurantDomainBuilder;
import enums.RecipeCategory;
import enums.RecipeType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RecipeDomain {
	
	private Integer id;
	
	private String recipeName;
	
	private RecipeType type;
	
	private RecipeCategory category;
	
	private Date created_tm;
	
	private Date updated_tm;
}
