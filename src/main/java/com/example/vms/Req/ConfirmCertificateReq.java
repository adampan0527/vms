package com.example.vms.Req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "ConfirmCertificateReq")
public class ConfirmCertificateReq {

    @ApiModelProperty(value = "序号id")
    Integer id;
}
