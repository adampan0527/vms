package com.example.vms.Req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel(value = "PaymentRemindReq")
public class PaymentRemindReq {

    @ApiModelProperty(value = "公司名称")
    private String name;

    @ApiModelProperty(value = "会费金额")
    private Float amount;

    @ApiModelProperty(value = "提醒用户列表")
    private List<String> members;
}
