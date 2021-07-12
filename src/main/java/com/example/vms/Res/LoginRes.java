package com.example.vms.Res;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "LoginRes")
public class LoginRes {

    @ApiModelProperty(value = "用户id")
    private String id;

    @ApiModelProperty(value = "用户姓名")
    private String name;

    @ApiModelProperty(value = "用户电话")
    private String tel;

    @ApiModelProperty(value = "用户性别")
    private String sex;

    @ApiModelProperty(value = "是否为管理员")
    private Boolean isadmin;
}
