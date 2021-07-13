package com.example.vms.controller;


import com.example.vms.service.IMembercompanyfeeService;
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
@RequestMapping("/membercompanyfee")
public class MembercompanyfeeController {

    @Autowired
    private IMembercompanyfeeService iMembercompanyfeeService;
}
