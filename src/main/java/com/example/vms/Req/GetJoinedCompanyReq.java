package com.example.vms.Req;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "GetJoinedCompanyReq")
public class GetJoinedCompanyReq {

    @ApiModelProperty(value = "用户id")
    private String memberid;
}
