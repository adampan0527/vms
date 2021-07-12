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
public class Membercompany implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("companyId")
    private String companyid;

    @TableField("memberId")
    private String memberid;


}
