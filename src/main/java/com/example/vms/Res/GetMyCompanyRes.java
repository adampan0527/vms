package com.example.vms.Res;

import com.example.vms.info.CompanyInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel(value = "GetMyCompanyRes")
public class GetMyCompanyRes {

    @ApiModelProperty(value = "单位信息列表")
    List<CompanyInfo> companyInfoList;
}
