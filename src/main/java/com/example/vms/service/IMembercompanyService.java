package com.example.vms.service;

import com.example.vms.entity.Membercompany;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Adam Pan
 * @since 2021-07-12
 */
public interface IMembercompanyService extends IService<Membercompany> {

    public Boolean kickout(String companyname, String membername);

    public Boolean joincompany(String companyname, String membername);
}
