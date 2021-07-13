package com.example.vms.Req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "ModifyAlipayReq")
public class ModifyAlipayReq {

    @ApiModelProperty(value = "单位名称")
    private String companyname;

    @ApiModelProperty(value = "单位支付宝账号")
    private String alipay;
}
