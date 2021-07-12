package com.example.vms.controller;


import com.example.vms.Req.AcceptApplyReq;
import com.example.vms.Req.LoginReq;
import com.example.vms.Req.RegisterReq;
import com.example.vms.Res.AcceptApplyRes;
import com.example.vms.Res.LoginRes;
import com.example.vms.Res.RegisterRes;
import com.example.vms.entity.Member;
import com.example.vms.info.MemberInfo;
import com.example.vms.service.ICompanyService;
import com.example.vms.service.IMemberService;
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
 * @since 2021-07-10
 */
@CrossOrigin
@RestController
@RequestMapping("/member")
@Api(tags = "会员模块")
public class MemberController {

    @Autowired
    private IMemberService iMemberService;

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
}
