package com.example.vms.Req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "ModifyFeeReq")
public class ModifyFeeReq {

    @ApiModelProperty(value = "单位名称")
    private String companyname;

    @ApiModelProperty(value = "单位会费")
    private Float fee;
}
