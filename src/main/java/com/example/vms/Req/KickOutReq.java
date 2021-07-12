package com.example.vms.Req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "KickOutReq")
public class KickOutReq {

    @ApiModelProperty(value = "公司名称")
    private String companyname;

    @ApiModelProperty(value = "用户名称")
    private String membername;
}
