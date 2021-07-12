package com.example.vms.mapper;

import com.example.vms.entity.Member;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Adam Pan
 * @since 2021-07-10
 */
@Mapper
public interface MemberMapper extends BaseMapper<Member> {

    public Member login(@Param("memberId") String id, @Param("memberPwd") String pwd);

    public int register(@Param("memberId") String id, @Param("memberPwd") String pwd,
                        @Param("memberName") String name, @Param("memberTel") String tel,
                        @Param("memberSex") Boolean sex, @Param("isAdmin") Boolean isAdmin);

    public String queryIdByName(@Param("memberName") String name);
}
