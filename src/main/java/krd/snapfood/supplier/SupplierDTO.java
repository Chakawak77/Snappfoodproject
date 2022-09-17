package krd.snapfood.supplier;

import io.swagger.annotations.ApiModelProperty;
import krd.snapfood.base.BaseDTO;
import krd.snapfood.category.Category;
import lombok.Data;

@Data
public class SupplierDTO extends BaseDTO {
    @ApiModelProperty(required = true,hidden = false)
    private String title;

    @ApiModelProperty(required = true,hidden = false)
    private String userName;

    @ApiModelProperty(required = true,hidden = false)
    private String password;

    @ApiModelProperty(required = true,hidden = false)
    private String linkImage;

    @ApiModelProperty(required = true,hidden = false)
    private LocationDTO location;

    @ApiModelProperty(required = true,hidden = false)
    private Long categoryId;

    @ApiModelProperty(required = true,hidden = false)
    private Category category;

}
