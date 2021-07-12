package com.example.vms.service.impl;

import com.example.vms.entity.Company;
import com.example.vms.entity.Membercompany;
import com.example.vms.info.CompanyInfo;
import com.example.vms.mapper.CompanyMapper;
import com.example.vms.mapper.MembercompanyMapper;
import com.example.vms.service.ICompanyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Adam Pan
 * @since 2021-07-12
 */
@Service
public class CompanyServiceImpl extends ServiceImpl<CompanyMapper, Company> implements ICompanyService {

    @Resource
    private CompanyMapper companyMapper;

    @Resource
    private MembercompanyMapper membercompanyMapper;

    @Override
    public Boolean paymentRemindSingle(String companyname, String memberid, Float amount) {
        int x = companyMapper.paymentRemind(companyname, memberid, amount);
        return x == 1;
    }

    @Override
    public List<String> paymentRemind(String companyname, List<String> memberlist, Float amount) {
        List<String> res = new ArrayList<String>();
        for (String memberid : memberlist) {
            if (!paymentRemindSingle(companyname, memberid, amount)) {
                res.add(memberid);
            }
        }
        return res;
    }

    @Override
    public Boolean newCompany(String companyname, String companyintro, String companyalipay, String memberid) {
        int x = companyMapper.newcompany(companyname, companyintro, companyalipay, memberid);
        int y = membercompanyMapper.insert(companyname, memberid);
        return x == 1 && y == 1;
    }

    @Override
    public CompanyInfo queryByName(String companyname) {
        CompanyInfo companyInfo = new CompanyInfo();
        Company company = companyMapper.queryByName(companyname);
        companyInfo = company.change();
        return companyInfo;
    }

    @Override
    public List<CompanyInfo> allCompany() {
        List<CompanyInfo> res = new ArrayList<>();
        List<Company> list = companyMapper.allCompany();
        for (Company company: list){
            res.add(company.change());
        }
        return res;
    }
}
