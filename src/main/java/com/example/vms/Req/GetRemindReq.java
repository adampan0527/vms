package com.example.vms.Req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "GetRemindReq")
public class GetRemindReq {

    @ApiModelProperty(value = "会员id")
    private String memberid;
}
