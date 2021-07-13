package com.example.vms.service;

import com.example.vms.entity.Company;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.vms.info.CompanyInfo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Adam Pan
 * @since 2021-07-12
 */
public interface ICompanyService extends IService<Company> {

    public Boolean paymentRemindSingle(String companyid, String memberid, Float amount);

    public List<String> paymentRemind(String companyid, List<String> memberlist, Float amount);

    public Boolean newCompany(String companyname, String companyintro, String companyalipay, String memberid);

    public CompanyInfo queryByName(String companyname);

    public List<CompanyInfo> allCompany();

    public List<CompanyInfo> myCompany(String memberid);

    public List<CompanyInfo> joinedCompany(String memberid);

    public Boolean modifyIntro(String companyname, String companyintro);

    public Boolean modifyFee(String companyname, Float companyfee);

    public Boolean modifyAlipay(String companyname, String companyalipay);
}
