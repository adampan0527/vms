package com.example.vms.controller;


import com.example.vms.Req.AllCompanyReq;
import com.example.vms.Req.NewCompanyReq;
import com.example.vms.Req.PaymentRemindReq;
import com.example.vms.Res.AllCompanyRes;
import com.example.vms.Res.NewCompanyRes;
import com.example.vms.Res.PaymentRemindRes;
import com.example.vms.info.CompanyInfo;
import com.example.vms.service.ICompanyService;
import com.example.vms.util.ResultBean;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Adam Pan
 * @since 2021-07-12
 */
@RestController
@RequestMapping("/company")
@Api(tags = "单位模块")
public class CompanyController {

    @Autowired
    private ICompanyService iCompanyService;

    @CrossOrigin
    @PostMapping("/newcompany")
    public ResultBean<NewCompanyRes> newcompany(@RequestBody NewCompanyReq req) {
        ResultBean<NewCompanyRes> res = new ResultBean<NewCompanyRes>();
        Boolean success = iCompanyService.newCompany(req.getCompanyname(), req.getCompanyintro(),
                req.getCompanyalipay(), req.getMemberid());
        if (success){
            res.setMsg("创建单位成功");
        } else {
            res.setMsg("创建单位失败");
            res.setCode(ResultBean.FAIL);
        }
        return res;
    }

    @CrossOrigin
    @PostMapping("/paymentremind")
    public ResultBean<PaymentRemindRes> paymentremind(@RequestBody PaymentRemindReq req) {
        ResultBean<PaymentRemindRes> res = new ResultBean<PaymentRemindRes>();
        List<String> failedMember = new ArrayList<String>();
        failedMember = iCompanyService.paymentRemind(req.getName(), req.getMembers(), req.getAmount());
        if (!failedMember.isEmpty()) {
            res.setCode(ResultBean.FAIL);
            PaymentRemindRes paymentRemindRes = new PaymentRemindRes();
            paymentRemindRes.setFailedmember(failedMember);
            res.setData(paymentRemindRes);
            res.setMsg("向以下用户提醒缴费失败");
        } else {
            res.setMsg("提醒缴费成功");
        }

        return res;
    }

    @CrossOrigin
    @PostMapping("allcompany")
    public ResultBean<AllCompanyRes> allcompany(@RequestBody AllCompanyReq req){
        ResultBean<AllCompanyRes> res = new ResultBean<>();
        AllCompanyRes allCompanyRes = new AllCompanyRes();
        List<CompanyInfo> list = iCompanyService.allCompany();
        allCompanyRes.setCompanyInfos(list);
        res.setMsg("查询成功");
        res.setData(allCompanyRes);
        return res;
    }

}
