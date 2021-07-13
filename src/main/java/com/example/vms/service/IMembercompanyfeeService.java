package com.example.vms.service;

import com.example.vms.entity.Membercompanyfee;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.vms.info.MembercompanyfeeInfo;

import java.sql.Blob;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Adam Pan
 * @since 2021-07-12
 */
public interface IMembercompanyfeeService extends IService<Membercompanyfee> {

    public List<MembercompanyfeeInfo> showUnpaid(String memberid);

    public List<MembercompanyfeeInfo> showByCompany(String companyname);

    public Boolean submitcertificate(Blob certificate, Integer id);

    public Boolean confirmcertificate(Integer id);
}
