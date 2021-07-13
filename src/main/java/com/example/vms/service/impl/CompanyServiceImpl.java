package com.example.vms.service.impl;

import com.example.vms.entity.Company;
import com.example.vms.entity.Member;
import com.example.vms.entity.Membercompany;
import com.example.vms.info.CompanyInfo;
import com.example.vms.info.MemberInfo;
import com.example.vms.mapper.CompanyMapper;
import com.example.vms.mapper.MemberMapper;
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

    @Resource
    private MemberMapper memberMapper;

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

    @Override
    public List<CompanyInfo> myCompany(String memberid) {
        List<CompanyInfo> res = new ArrayList<>();
        List<Company> list = companyMapper.myCompany(memberid);
        for (Company company: list){
            res.add(company.change());
        }
        return res;
    }

    @Override
    public List<CompanyInfo> joinedCompany(String memberid) {
        List<CompanyInfo> res = new ArrayList<>();
        List<Company> list = companyMapper.joinedCompany(memberid);
        for (Company company: list){
            res.add(company.change());
        }
        return res;
    }

    @Override
    public Boolean modifyIntro(String companyname, String companyintro) {
        Integer x = companyMapper.modifyIntro(companyname, companyintro);
        return x==1;
    }

    @Override
    public Boolean modifyFee(String companyname, Float companyfee) {
        Integer x = companyMapper.modifyFee(companyname, companyfee);
        return x==1;
    }

    @Override
    public Boolean modifyAlipay(String companyname, String companyalipay) {
        Integer x = companyMapper.modifyAlipay(companyname, companyalipay);
        return x==1;
    }

    @Override
    public List<MemberInfo> allMember(String companyname) {
        List<MemberInfo> res = new ArrayList<>();
        List<Member> list = new ArrayList<>();
        list = companyMapper.allMember(companyname);
        for (Member member: list){
            res.add(member.change());
        }
        return res;
    }
}
