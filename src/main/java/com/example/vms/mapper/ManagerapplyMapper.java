package com.example.vms.mapper;

import com.example.vms.entity.Managerapply;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.vms.info.ManagerApplyInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author Adam Pan
 * @since 2021-07-12
 */
@Mapper
public interface ManagerapplyMapper extends BaseMapper<Managerapply> {

    public Integer apply(@Param("memberId") String memberid, @Param("managerApplyCompanyName") String companyname,
                         @Param("managerApplyCompanyIntro") String companyintro, @Param("managerApplyCompanyAlipay") String companyalipay);

    public Integer acceptapply(@Param("memberId") String memberid);

    public Integer checkmemberapplynum(@Param("memberId") String memberid);

    public ManagerApplyInfo queryByMemberId(@Param("memberId") String memberid);
}
