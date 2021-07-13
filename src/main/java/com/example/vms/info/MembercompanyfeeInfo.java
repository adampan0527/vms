package com.example.vms.info;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.sql.Blob;

@Data
@ApiModel(value = "MembercompanyfeeInfo")
public class MembercompanyfeeInfo {

    @ApiModelProperty(value = "提醒id")
    private Integer membercompanyfeeid;

    @ApiModelProperty(value = "公司名称")
    private String companyname;

    @ApiModelProperty(value = "会员id")
    private String memberid;

    @ApiModelProperty(value = "会费金额")
    private Float membercompanyfeeamount;

    @ApiModelProperty(value = "是否支付")
    private Boolean membercompanyfeepaid;

    @ApiModelProperty(value = "支付证明")
    private Blob membercompanyfeecertificate;

    @ApiModelProperty(value = "是否已被确认")
    private Boolean membercompanyfeechecked;
}
