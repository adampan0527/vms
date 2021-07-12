package com.example.vms.Req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "LoginReq")
public class LoginReq {

    @ApiModelProperty(value = "用户id")
    private String id;

    @ApiModelProperty(value = "用户密码")
    private String pwd;
}
