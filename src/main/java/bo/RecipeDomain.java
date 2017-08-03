package bo;

import java.util.Date;

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
	// 菜名
	private String recipeName;
	// 菜系
	private RecipeType recipeType;
	// 类别种类
	private RecipeCategory category;

	private Date created_tm;

	private Date updated_tm;
}
