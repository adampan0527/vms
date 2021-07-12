package com.example.vms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
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
public class Managerapply implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("managerApplyId")
    private Integer managerapplyid;

    @TableField("managerApplyCompanyName")
    private String managerapplycompanyname;

    @TableField("managerApplyCompanyIntro")
    private String managerapplycompanyintro;

    @TableField("managerApplyCompanyAlipay")
    private String managerapplycompanyalipay;


}
