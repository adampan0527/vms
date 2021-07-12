package com.example.vms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import java.sql.Blob;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
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

    @TableId("companyId")
    private String companyid;

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


}
