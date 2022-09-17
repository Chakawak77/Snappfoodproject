package krd.snapfood.category;

import io.swagger.annotations.ApiModelProperty;
import krd.snapfood.base.BaseDTO;
import lombok.Data;

@Data
public class CategoryDTO extends BaseDTO {

    @ApiModelProperty(required = true,hidden = false)
    private String title;

    @ApiModelProperty(required = true,hidden = false)
    private String icon;

}
