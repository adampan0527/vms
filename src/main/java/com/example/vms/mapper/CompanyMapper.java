package com.example.vms.mapper;

import com.example.vms.entity.Company;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.vms.entity.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

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
public interface CompanyMapper extends BaseMapper<Company> {

    public int paymentRemind(@Param("companyName") String companyname, @Param("memberId") String memberid, @Param("memberCompanyFeeAmount") Float amount);

    public int newcompany(@Param("companyName") String companyname, @Param("companyIntro") String companyintro,
                          @Param("companyAlipay") String companyalipay, @Param("companyOwner") String companyowner);

    public Company queryByName(@Param("companyName") String companyname);

    public List<Company> allCompany();

    public List<Company> myCompany(@Param("companyOwner") String companyowner);

    public List<Company> joinedCompany(@Param("memberId") String memberid);

    public Integer modifyIntro(@Param("companyName") String companyname, @Param("companyIntro") String intro);

    public Integer modifyFee(@Param("companyName") String companyname, @Param("companyFee") Float companyfee);

    public Integer modifyAlipay(@Param("companyName") String companyname, @Param("companyAlipay") String companyalipay);

    public List<Member> allMember(@Param("companyName") String companyname);
}
