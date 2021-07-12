package com.example.vms.Res;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel(value = "PaymentRemindRes")
public class PaymentRemindRes {

    @ApiModelProperty(value = "提醒缴费失败的用户列表")
    private List<String> failedmember;

}
