package com.example.vms.Res;

import com.example.vms.info.MemberInfo;
import com.example.vms.info.Minfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel(value = "获取单位成员返回信息")
public class AllMemberRes {
    @ApiModelProperty(value = "单位成员列表")
    private List<Minfo> member;
}
