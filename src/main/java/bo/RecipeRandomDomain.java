package bo;

import java.util.Date;

import enums.RestRecipeRelationStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RecipeRandomDomain {

	private Integer restaurantId;
	
	private Integer recipeId;
	
	private Integer personNum;

	private String restaurantName;
	
	private String recipeName;

	private int recipePrice;

	private Date created_tm;

	private Date updated_tm;

}
