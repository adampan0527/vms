package com.example.vms.service.impl;

import com.example.vms.entity.Managerapply;
import com.example.vms.info.ManagerApplyInfo;
import com.example.vms.mapper.ManagerapplyMapper;
import com.example.vms.service.IManagerapplyService;
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
public class ManagerapplyServiceImpl extends ServiceImpl<ManagerapplyMapper, Managerapply> implements IManagerapplyService {

    @Resource
    private ManagerapplyMapper managerapplyMapper;

    @Override
    public Integer checkmemberapplynum(String memberid){
        return managerapplyMapper.checkmemberapplynum(memberid);
    }

    @Override
    public ManagerApplyInfo queryByMemberId(String memberid) {
        ManagerApplyInfo managerApplyInfo = new ManagerApplyInfo();
        managerApplyInfo = managerapplyMapper.queryByMemberId(memberid);
        return managerApplyInfo;
    }

    @Override
    public Boolean apply(String memberid, String companyname, String companyintro, String companyalipay) {
        int x=managerapplyMapper.apply(memberid, companyname, companyintro, companyalipay);
        return x==1;
    }

    @Override
    public Boolean acceptapply(String memberid) {
        int x = managerapplyMapper.acceptapply(memberid);
        return x==1;
    }
}
