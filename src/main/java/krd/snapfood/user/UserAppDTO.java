package krd.snapfood.user;

import io.swagger.annotations.ApiModelProperty;
import krd.snapfood.base.BaseDTO;
import lombok.Data;

@Data
public class UserAppDTO extends BaseDTO {

    @ApiModelProperty(required = true,hidden = false)
    private String userName;

    @ApiModelProperty(required = true,hidden = false)
    private String password;

    @ApiModelProperty(required = true,hidden = false)
    private String phone;

}