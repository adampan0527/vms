package com.example.vms.controller;


import com.example.vms.Req.JoinCompanyReq;
import com.example.vms.Req.KickOutReq;
import com.example.vms.Res.JoinCompanyRes;
import com.example.vms.Res.KickOutRes;
import com.example.vms.service.IMembercompanyService;
import com.example.vms.util.ResultBean;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Adam Pan
 * @since 2021-07-12
 */
@RestController
@RequestMapping("/membercompany")
@Api(tags = "单位成员模块")
public class MembercompanyController {

    @Autowired
    private IMembercompanyService iMembercompanyService;

    @CrossOrigin
    @PostMapping("/kickout")
    public ResultBean<KickOutRes> kickOut(@RequestBody KickOutReq req){
        ResultBean<KickOutRes> res = new ResultBean<>();
        Boolean x = iMembercompanyService.kickout(req.getCompanyname(), req.getMembername());
        if(x){
            res.setMsg("踢出会员成功");
        } else {
            res.setCode(ResultBean.FAIL);
            res.setMsg("踢出会员失败");
        }
        return res;
    }

    @CrossOrigin
    @PostMapping("/joincompany")
    public ResultBean<JoinCompanyRes> joinCompany(@RequestBody JoinCompanyReq req){
        ResultBean<JoinCompanyRes> res = new ResultBean<>();
        Boolean x = iMembercompanyService.joincompany(req.getCompanyname(), req.getMembername());
        if (x){
            res.setMsg("加入单位成功");
        } else {
            res.setCode(ResultBean.FAIL);
            res.setMsg("加入单位失败");
        }
        return res;
    }
}
