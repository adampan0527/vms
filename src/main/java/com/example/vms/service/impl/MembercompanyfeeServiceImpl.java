package com.example.vms.service.impl;

import com.example.vms.entity.Membercompanyfee;
import com.example.vms.info.MembercompanyfeeInfo;
import com.example.vms.mapper.MembercompanyfeeMapper;
import com.example.vms.service.IMembercompanyfeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Adam Pan
 * @since 2021-07-12
 */
@Service
public class MembercompanyfeeServiceImpl extends ServiceImpl<MembercompanyfeeMapper, Membercompanyfee> implements IMembercompanyfeeService {

    @Resource
    private MembercompanyfeeMapper membercompanyfeeMapper;

    @Override
    public List<MembercompanyfeeInfo> showUnpaid(String memberid) {
        List<Membercompanyfee> list = membercompanyfeeMapper.showUnpaid(memberid);
        List<MembercompanyfeeInfo> res = new ArrayList<>();
        for (Membercompanyfee membercompanyfee: list){
            res.add(membercompanyfee.change());
        }
        return res;
    }

    @Override
    public List<MembercompanyfeeInfo> showByCompany(String companyname) {
        List<Membercompanyfee> list = membercompanyfeeMapper.showByCompany(companyname);
        List<MembercompanyfeeInfo> res = new ArrayList<>();
        for (Membercompanyfee membercompanyfee: list){
            res.add(membercompanyfee.change());
        }
        return res;
    }

    @Override
    public Boolean submitcertificate(Blob certificate, Integer id) {
        Integer x = membercompanyfeeMapper.submitcertificate(certificate, id);
        return x==1;
    }

    @Override
    public Boolean confirmcertificate(Integer id) {
        Integer x = membercompanyfeeMapper.confirmcertificate(id);
        return x==1;
    }
}
