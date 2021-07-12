package com.example.vms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import com.example.vms.info.CompanyInfo;
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
public class Company implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("companyName")
    private String companyname;

    @TableField("companyIntro")
    private String companyintro;

    @TableField("companyFee")
    private Float companyfee;

    @TableField("companyAlipay")
    private String companyalipay;

    @TableField("companyOwner")
    private String companyowner;

    public CompanyInfo change(){
        CompanyInfo companyInfo = new CompanyInfo();
        MyBeanUtils.copyProperties(this, companyInfo);
        return companyInfo;
    }
}
