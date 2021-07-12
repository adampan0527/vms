package com.example.vms.Req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "RegisterReq")
public class RegisterReq {

    @ApiModelProperty(value = "用户id")
    private String id;

    @ApiModelProperty(value = "用户密码")
    private String pwd;

    @ApiModelProperty(value = "用户姓名")
    private String name;

    @ApiModelProperty(value = "用户电话")
    private String tel;

    @ApiModelProperty(value = "用户性别")
    private String sex;
}
