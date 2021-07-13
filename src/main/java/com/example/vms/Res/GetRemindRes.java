package com.example.vms.Res;

import com.example.vms.info.MembercompanyfeeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel(value = "GetRemindRes")
public class GetRemindRes {

    @ApiModelProperty(value = "未操作的缴费提醒")
    private List<MembercompanyfeeInfo> list;
}
