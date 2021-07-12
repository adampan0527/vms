package com.example.vms.service.impl;

import com.example.vms.entity.Membercompany;
import com.example.vms.mapper.MemberMapper;
import com.example.vms.mapper.MembercompanyMapper;
import com.example.vms.service.IMembercompanyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Adam Pan
 * @since 2021-07-12
 */
@Service
public class MembercompanyServiceImpl extends ServiceImpl<MembercompanyMapper, Membercompany> implements IMembercompanyService {

    @Resource
    private MembercompanyMapper membercompanyMapper;

    @Resource
    private MemberMapper memberMapper;

    @Override
    public Boolean kickout(String companyname, String membername) {
        String memberid = memberMapper.queryIdByName(membername);
        Integer x = membercompanyMapper.kickout(companyname, memberid);
        return x==1;
    }

    @Override
    public Boolean joincompany(String companyname, String membername) {
        String memberid = memberMapper.queryIdByName(membername);
        Integer x = membercompanyMapper.joincompany(companyname, memberid);
        return x==1;
    }
}
