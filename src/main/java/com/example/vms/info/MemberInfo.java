package com.example.vms.info;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "MemberInfo")
public class MemberInfo {

    @ApiModelProperty(value = "会员id")
    private String memberid;

    @ApiModelProperty(value = "会员密码")
    private String memberpwd;

    @ApiModelProperty(value = "会员姓名")
    private String membername;

    @ApiModelProperty(value = "会员电话")
    private String membertel;

    @ApiModelProperty(value = "会员性别")
    private Boolean membersex;

    @ApiModelProperty(value = "是否为管理员")
    private Boolean isadmin;
}
