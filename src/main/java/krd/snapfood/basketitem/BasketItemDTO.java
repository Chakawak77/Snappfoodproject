package krd.snapfood.basketitem;

import io.swagger.annotations.ApiModelProperty;
import krd.snapfood.base.BaseDTO;
import krd.snapfood.suppliercategory.SupplierCategory;
import lombok.Data;

@Data
public class BasketItemDTO extends BaseDTO {

    @ApiModelProperty(required = true,hidden = false)
    private Long foodId;

    @ApiModelProperty(required = true,hidden = false)
    private Double price;

    @ApiModelProperty(required = true,hidden = false)
    private String icon;

    @ApiModelProperty(required = true,hidden = false)
    private Long count;

    @ApiModelProperty(required = true,hidden = false)
    private SupplierCategory supplierCategory;
}
