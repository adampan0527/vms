package com.example.vms.Req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.sql.Blob;

@Data
@ApiModel(value = "SubmitCertificateReq")
public class SubmitCertificateReq {

    @ApiModelProperty(value = "证明图片")
    private Blob certificate;

    @ApiModelProperty(value = "未缴费的序号id")
    private Integer id;
}
