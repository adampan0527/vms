package com.example.vms.mapper;

import com.example.vms.entity.Membercompany;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Adam Pan
 * @since 2021-07-12
 */
@Mapper
public interface MembercompanyMapper extends BaseMapper<Membercompany> {

    public Integer insert(@Param("companyName") String companyname, @Param("memberId") String memberid);

    public Integer kickout(@Param("companyName") String companyname, @Param("memberId") String memberid);

    public Integer query(@Param("companyName") String companyname, @Param("memberId") String memberid);

    public Integer joincompany(@Param("companyName") String companyname, @Param("memberId") String memberid);
}
