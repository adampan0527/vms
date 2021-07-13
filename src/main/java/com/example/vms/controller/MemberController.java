package com.example.vms.controller;


import com.example.vms.Req.*;
import com.example.vms.Res.*;
import com.example.vms.info.MemberInfo;
import com.example.vms.info.MembercompanyfeeInfo;
import com.example.vms.service.IMemberService;
import com.example.vms.service.IMembercompanyfeeService;
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
 * @since 2021-07-10
 */
@CrossOrigin
@RestController
@RequestMapping("/member")
@Api(tags = "会员模块")
public class MemberController {

    @Autowired
    private IMemberService iMemberService;

    @Autowired
    private IMembercompanyfeeService iMembercompanyfeeService;

    @CrossOrigin
    @PostMapping("/login")
    public ResultBean<LoginRes> login(@RequestBody LoginReq req) {
        ResultBean<LoginRes> res = new ResultBean<LoginRes>();
        LoginRes loginRes = new LoginRes();
        MemberInfo memberInfo = new MemberInfo();
        memberInfo = iMemberService.login(req.getId(), req.getPwd());
        if(memberInfo==null){
            res.setCode(ResultBean.FAIL);
            res.setMsg("用户名或密码错误");
            return res;
        }
        loginRes.setId(memberInfo.getMemberid());
        loginRes.setName(memberInfo.getMembername());
        loginRes.setTel(memberInfo.getMembertel());
        if (memberInfo.getMembersex()==null){
            loginRes.setSex("");
        } else if(memberInfo.getMembersex()){
            loginRes.setSex("男");
        }else{
            loginRes.setSex("女");
        }
        loginRes.setIsadmin(memberInfo.getIsadmin());
        res.setData(loginRes);
        if (res.getData()==null){
            res.setCode(ResultBean.FAIL);
            res.setMsg("用户名或密码错误");
        } else {
            res.setMsg("登录成功");
        }

        return res;
    }

    @CrossOrigin
    @PostMapping("/register")
    public ResultBean<RegisterRes> register(@RequestBody RegisterReq req){
        ResultBean<RegisterRes> res = new ResultBean<RegisterRes>();
        Boolean success = iMemberService.register(req.getId(), req.getPwd(), req.getName(), req.getTel(), req.getSex());
        if (success){
            res.setMsg("注册成功");
        } else {
            res.setMsg("未知错误");
            res.setCode(ResultBean.FAIL);
        }

        return res;
    }

    @CrossOrigin
    @PostMapping("/modifytel")
    public ResultBean<ModifyMemberTelRes> modifyTel(@RequestBody ModifyMemberTelReq req){
        ResultBean<ModifyMemberTelRes> res = new ResultBean<>();
        Boolean x = iMemberService.modifyTel(req.getMemberid(), req.getTel());
        if (x){
            res.setMsg("修改成功");
        } else {
            res.setMsg("修改失败");
            res.setCode(ResultBean.FAIL);
        }
        return res;
    }

    @CrossOrigin
    @PostMapping("/modifysex")
    public ResultBean<ModifyMemberSexRes> modifySex(@RequestBody ModifyMemberSexReq req){
        ResultBean<ModifyMemberSexRes> res = new ResultBean<>();
        Boolean x = iMemberService.modifySex(req.getMemberid(), req.getSex());
        if (x){
            res.setMsg("修改成功");
        } else {
            res.setMsg("修改失败");
            res.setCode(ResultBean.FAIL);
        }
        return res;
    }

    @CrossOrigin
    @PostMapping("/modifypwd")
    public ResultBean<ModifyMemberPwdRes> modifyPwd(@RequestBody ModifyMemberPwdReq req){
        ResultBean<ModifyMemberPwdRes> res = new ResultBean<>();
        Boolean x = iMemberService.modifyPwd(req.getMemberid(), req.getPwd());
        if (x){
            res.setMsg("修改成功");
        } else {
            res.setMsg("修改失败");
            res.setCode(ResultBean.FAIL);
        }
        return res;
    }

    @CrossOrigin
    @PostMapping("/getremind")
    public ResultBean<GetRemindRes> getRemind(@RequestBody GetRemindReq req){
        ResultBean<GetRemindRes> res = new ResultBean<>();
        GetRemindRes getRemindRes = new GetRemindRes();
        List<MembercompanyfeeInfo> list = new ArrayList<>();
        list = iMembercompanyfeeService.showUnpaid(req.getMemberid());
        getRemindRes.setList(list);
        res.setData(getRemindRes);
        res.setMsg("获取成功");
        return res;
    }

    @CrossOrigin
    @PostMapping("/submitcertificate")
    public ResultBean<SubmitCertificateRes> submitCertificate(@RequestBody SubmitCertificateReq req){
        ResultBean<SubmitCertificateRes> res = new ResultBean<>();
        Boolean x = iMembercompanyfeeService.submitcertificate(req.getCertificate(), req.getId());
        if (x) {
            res.setMsg("提交成功");
        } else {
            res.setCode(ResultBean.FAIL);
            res.setMsg("提交失败");
        }
        return res;
    }

    @CrossOrigin
    @PostMapping("/confirmcertificate")
    public ResultBean<ConfirmCertificateRes> confirm(@RequestBody ConfirmCertificateReq req){
        ResultBean<ConfirmCertificateRes> res = new ResultBean<>();
        Boolean x = iMembercompanyfeeService.confirmcertificate(req.getId());
        if (x) {
            res.setMsg("确认成功");
        } else {
            res.setCode(ResultBean.FAIL);
            res.setMsg("确认失败");
        }
        return res;
    }

    @CrossOrigin
    @PostMapping("/getpaidcertificate")
    public ResultBean<GetPaidCertificateRes> getPaidCertificate(@RequestBody GetPaidCertificateReq req){
        ResultBean<GetPaidCertificateRes> res = new ResultBean<>();
        GetPaidCertificateRes getPaidCertificateRes = new GetPaidCertificateRes();
        List<MembercompanyfeeInfo> list = new ArrayList<>();
        list = iMembercompanyfeeService.showByCompany(req.getCompanyname());
        if(list==null){
            res.setMsg("查询失败");
            res.setCode(ResultBean.FAIL);
            return res;
        }
        getPaidCertificateRes.setPayments(list);
        res.setData(getPaidCertificateRes);
        res.setMsg("查询成功");

        return res;
    }

}
