package com.example.vms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import com.example.vms.info.MemberInfo;
import com.example.vms.util.MyBeanUtils;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author Adam Pan
 * @since 2021-07-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Member implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("memberId")
    private String memberid;

    @TableField("memberPwd")
    private String memberpwd;

    @TableField("memberName")
    private String membername;

    @TableField("memberTel")
    private String membertel;

    @TableField("memberSex")
    private Boolean membersex;

    @TableField("isAdmin")
    private Boolean isadmin;

    public MemberInfo change(){
        MemberInfo memberInfo = new MemberInfo();
        MyBeanUtils.copyProperties(this, memberInfo);
        return memberInfo;
    }
}
