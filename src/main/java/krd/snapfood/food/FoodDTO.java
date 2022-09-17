package krd.snapfood.food;

import io.swagger.annotations.ApiModelProperty;
import krd.snapfood.base.BaseDTO;
import lombok.Data;

@Data
public class FoodDTO extends BaseDTO {

    @ApiModelProperty(required = true,hidden = false)
    private String name;

    @ApiModelProperty(required = true,hidden = false)
    private Double price;

    @ApiModelProperty(required = true,hidden = false)
    private String description;

}
