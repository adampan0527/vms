package com.example.vms.service;

import com.example.vms.entity.Member;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.vms.info.MemberInfo;

import java.nio.charset.MalformedInputException;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Adam Pan
 * @since 2021-07-10
 */
public interface IMemberService extends IService<Member> {

    public MemberInfo login(String id, String pwd);

    public Boolean register(String id, String pwd, String name, String tel, String sex);

    public String queryIdByName(String name);
}
