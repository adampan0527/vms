package com.example.vms.Res;

import com.example.vms.info.MembercompanyfeeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel(value = "GetPaidCertificateRes")
public class GetPaidCertificateRes {

    @ApiModelProperty(value = "账单信息")
    List<MembercompanyfeeInfo> payments;

}
