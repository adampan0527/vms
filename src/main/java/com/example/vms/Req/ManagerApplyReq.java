package com.example.vms.Req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "ManagerApplyReq")
public class ManagerApplyReq {

    @ApiModelProperty(value = "申请人id")
    private String memberid;

    @ApiModelProperty(value = "公司名称")
    private String companyname;

    @ApiModelProperty(value = "公司简介")
    private String companyintro;

    @ApiModelProperty(value = "公司支付宝账号")
    private String companyalipay;
}
