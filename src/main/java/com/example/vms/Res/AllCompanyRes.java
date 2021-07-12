package com.example.vms.Res;

import com.example.vms.info.CompanyInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel(value = "AllCompanyRes")
public class AllCompanyRes {
    @ApiModelProperty(value = "公司列表")
    private List<CompanyInfo> companyInfos;
}
