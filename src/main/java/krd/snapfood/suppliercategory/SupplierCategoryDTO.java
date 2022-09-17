package krd.snapfood.suppliercategory;

import io.swagger.annotations.ApiModelProperty;
import krd.snapfood.base.BaseDTO;
import krd.snapfood.supplier.Supplier;
import lombok.Data;

@Data
public class SupplierCategoryDTO extends BaseDTO {

    @ApiModelProperty(required = true,hidden = false)
    private String title;

    @ApiModelProperty(required = true,hidden = false)
    private Long supplierId;

    @ApiModelProperty(required = true,hidden = false)
    private Supplier supplier;

}