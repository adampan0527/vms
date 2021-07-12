package com.example.vms.service;

import com.example.vms.entity.Managerapply;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.vms.info.ManagerApplyInfo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Adam Pan
 * @since 2021-07-12
 */
public interface IManagerapplyService extends IService<Managerapply> {

    public Boolean apply(String memberid, String companyname, String companyintro, String companyalipay);

    public Boolean acceptapply(String memberid);

    public Integer checkmemberapplynum(String memberid);

    public ManagerApplyInfo queryByMemberId(String memberid);
}
