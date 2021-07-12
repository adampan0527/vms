package com.example.vms.Req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class NewCompanyReq {

    @ApiModelProperty(value = "公司名称")
    private String companyname;

    @ApiModelProperty(value = "公司简介")
    private String companyintro;

    @ApiModelProperty(value = "创始人id")
    private String memberid;

    @ApiModelProperty(value = "公司支付宝账号")
    private String companyalipay;
}
