package com.example.vms.info;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@Data
@ApiModel(value = "ManagerApplyInfo")
public class ManagerApplyInfo {

    @ApiModelProperty(value = "申请人id")
    private Integer managerapplyid;

    @ApiModelProperty(value = "申请公司名称")
    private String managerapplycompanyname;

    @ApiModelProperty(value = "申请公司简介")
    private String managerapplycompanyintro;

    @ApiModelProperty(value = "申请公司支付宝账号")
    private String managerapplycompanyalipay;
}
