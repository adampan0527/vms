package com.example.vms.Req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "memberid")
public class JoinCompanyReq {

    @ApiModelProperty(value = "公司名称")
    private String companyname;

    @ApiModelProperty(value = "会员名称")
    private String membername;
}
