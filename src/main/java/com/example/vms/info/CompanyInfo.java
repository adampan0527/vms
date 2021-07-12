package com.example.vms.info;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "CompanyInfo")
public class CompanyInfo {

    @ApiModelProperty(value = "单位名称")
    private String companyname;

    @ApiModelProperty(value = "单位简介")
    private String companyintro;

    @ApiModelProperty(value = "单位会费")
    private Float companyfee;

    @ApiModelProperty(value = "单位支付宝账号")
    private String companyalipay;

    @ApiModelProperty(value = "单位拥有者")
    private String companyowner;
}
