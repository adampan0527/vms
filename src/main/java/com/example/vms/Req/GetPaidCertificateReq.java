package com.example.vms.Req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "GetPaidCertificateReq")
public class GetPaidCertificateReq {

    @ApiModelProperty(value = "单位名称")
    private String companyname;

}
