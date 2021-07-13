package com.example.vms.service.impl;

import com.example.vms.entity.Member;
import com.example.vms.info.MemberInfo;
import com.example.vms.mapper.MemberMapper;
import com.example.vms.service.IMemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Adam Pan
 * @since 2021-07-10
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements IMemberService {

    @Resource
    private MemberMapper memberMapper;

    @Override
    public MemberInfo login(String id, String pwd) {
        MemberInfo memberInfo = new MemberInfo();
        Member member = new Member();
        member = memberMapper.login(id, pwd);
        if (member != null && pwd.equals(member.getMemberpwd())) {
            memberInfo = member.change();
        } else return null;
        return memberInfo;
    }

    @Override
    public Boolean register(String id, String pwd, String name, String tel, String sex) {
        int x = memberMapper.register(id, pwd, name, tel, sex.equals("男"), false);
        return x==1;
    }

    @Override
    public String queryIdByName(String name) {
        return memberMapper.queryIdByName(name);
    }

    @Override
    public Boolean modifyTel(String id, String tel) {
        Integer x = memberMapper.modifyTel(id, tel);
        return x==1;
    }

    @Override
    public Boolean modifySex(String id, String sex) {
        Boolean ss;
        if(sex.equals("男")) ss=true;
        else ss=false;
        Integer x = memberMapper.modifySex(id, ss);
        return x==1;
    }

    @Override
    public Boolean modifyPwd(String id, String pwd) {
        Integer x = memberMapper.modifyPwd(id, pwd);
        return x==1;
    }
}
