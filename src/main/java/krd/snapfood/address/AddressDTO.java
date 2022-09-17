package krd.snapfood.address;

import io.swagger.annotations.ApiModelProperty;
import krd.snapfood.base.BaseDTO;
import krd.snapfood.supplier.LocationDTO;
import krd.snapfood.user.UserApp;
import lombok.Data;

@Data
public class AddressDTO extends BaseDTO {

    @ApiModelProperty(required = true,hidden = false)
    private LocationDTO location;

    @ApiModelProperty(required = true,hidden = false)
    private String address;

    @ApiModelProperty(required = true,hidden = false)
    private Long userId;

    @ApiModelProperty(required = true,hidden = false)
    private String phoneNumber;

    @ApiModelProperty(required = true,hidden = false)
    private UserApp userApp;

}
