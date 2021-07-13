package com.example.vms.Req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "ModifyMemberSexReq")
public class ModifyMemberSexReq {

    @ApiModelProperty(value = "会员id")
    private String memberid;

    @ApiModelProperty(value = "新性别")
    private String sex;
}
