package com.example.vms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import java.sql.Blob;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import com.example.vms.info.MembercompanyfeeInfo;
import com.example.vms.util.MyBeanUtils;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author Adam Pan
 * @since 2021-07-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Membercompanyfee implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("memberCompanyFeeId")
    private Integer membercompanyfeeid;

    @TableField("companyName")
    private String companyname;

    @TableField("memberId")
    private String memberid;

    @TableField("memberCompanyFeeAmount")
    private Float membercompanyfeeamount;

    @TableField("memberCompanyFeePaid")
    private Boolean membercompanyfeepaid;

    @TableField("memberCompanyFeeCertificate")
    private Blob membercompanyfeecertificate;

    @TableField("memberCompanyFeeChecked")
    private Boolean membercompanyfeechecked;

    public MembercompanyfeeInfo change(){
        MembercompanyfeeInfo membercompanyfeeInfo = new MembercompanyfeeInfo();
        MyBeanUtils.copyProperties(this, membercompanyfeeInfo);
        return membercompanyfeeInfo;
    }

}
