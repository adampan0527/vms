package com.example.vms.controller;


import com.example.vms.Req.AcceptApplyReq;
import com.example.vms.Req.ManagerApplyReq;
import com.example.vms.Res.AcceptApplyRes;
import com.example.vms.Res.ManagerApplyRes;
import com.example.vms.info.CompanyInfo;
import com.example.vms.info.ManagerApplyInfo;
import com.example.vms.service.ICompanyService;
import com.example.vms.service.IManagerapplyService;
import com.example.vms.util.ResultBean;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Adam Pan
 * @since 2021-07-12
 */
@RestController
@RequestMapping("/managerapply")
@Api(tags = "申请创建单位模块")
public class ManagerapplyController {

    @Autowired
    private IManagerapplyService iManagerapplyService;

    @Autowired
    private ICompanyService iCompanyService;

    @CrossOrigin
    @PostMapping("/apply")
    public ResultBean<ManagerApplyRes> apply(@RequestBody ManagerApplyReq req) {
        ResultBean<ManagerApplyRes> res = new ResultBean<>();
        Integer num = iManagerapplyService.checkmemberapplynum(req.getMemberid());
        if (num > 0) {
            res.setMsg("有申请尚未处理");
            res.setCode(ResultBean.FAIL);
            return res;
        }
        Boolean x = iManagerapplyService.apply(req.getMemberid(), req.getCompanyname(), req.getCompanyintro(), req.getCompanyalipay());
        if (x) {
            res.setMsg("申请成功");
        } else {
            res.setCode(ResultBean.FAIL);
            res.setMsg("未知错误");
        }
        return res;
    }


    @CrossOrigin
    @PostMapping("/acceptapply")
    public ResultBean<AcceptApplyRes> acceptApply(@RequestBody AcceptApplyReq req) {
        ResultBean<AcceptApplyRes> res = new ResultBean<>();
        ManagerApplyInfo managerApplyInfo = new ManagerApplyInfo();
        managerApplyInfo = iManagerapplyService.queryByMemberId(req.getMemberid());
        Boolean x = iCompanyService.newCompany(managerApplyInfo.getManagerapplycompanyname(), managerApplyInfo.getManagerapplycompanyintro(),
                managerApplyInfo.getManagerapplycompanyalipay(), req.getMemberid());
        if (x) {
            Boolean a = iManagerapplyService.acceptapply(req.getMemberid());
            if (!a) {
                res.setMsg("未知错误");
                res.setCode(ResultBean.FAIL);
            }
        } else {
            res.setMsg("未知错误");
            res.setCode(ResultBean.FAIL);
        }
        return res;
    }
}
