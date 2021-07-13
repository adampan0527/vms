package com.example.vms.Req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "ModifyMemberTelReq")
public class ModifyMemberTelReq {

    @ApiModelProperty(value = "会员id")
    private String memberid;

    @ApiModelProperty(value = "新电话号码")
    private String tel;
}
