package krd.snapfood.basket;

import io.swagger.annotations.ApiModelProperty;
import krd.snapfood.base.BaseDTO;
import lombok.Data;

@Data
public class BasketDTO extends BaseDTO {

    @ApiModelProperty(required = true,hidden = false)
    private String title;

    @ApiModelProperty(required = true,hidden = false)
    private Long paidPrice;

    @ApiModelProperty(required = true,hidden = false)
    private Long supplierId;

    @ApiModelProperty(required = true,hidden = false)
    private Long addressId;

    @ApiModelProperty(required = true,hidden = false)
    private Boolean end;
}
