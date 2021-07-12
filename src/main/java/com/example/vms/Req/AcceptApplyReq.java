package com.example.vms.Req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "AcceptApplyReq")
public class AcceptApplyReq {

    @ApiModelProperty(value = "创始人id")
    private String memberid;
}
