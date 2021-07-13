package com.example.vms.mapper;

import com.example.vms.entity.Membercompanyfee;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.Blob;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Adam Pan
 * @since 2021-07-12
 */
@Mapper
public interface MembercompanyfeeMapper extends BaseMapper<Membercompanyfee> {

    public Integer remind(@Param("companyName") String companyname, @Param("memberId") String memberid, @Param("memberCompanyFeeAmount") Float fee);

    public List<Membercompanyfee> showUnpaid(@Param("memberId") String memberid);

    public List<Membercompanyfee> showByCompany(@Param("companyName") String companyname);

    public Integer submitcertificate(@Param("memberCompanyCertificate")  Blob certificate,
                                     @Param("memberCompanyFeeId") Integer id);

    public Integer confirmcertificate(@Param("memberCompanyFeeId") Integer id);
}
