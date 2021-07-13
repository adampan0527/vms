package com.example.vms.Req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "ModifyIntroReq")
public class ModifyIntroReq {

    @ApiModelProperty(value = "单位名称")
    private String companyname;

    @ApiModelProperty(value = "单位简介")
    private String intro;
}
