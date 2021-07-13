package com.example.vms.info;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class Minfo {
    private String memberid;

    private String memberpwd;

    private String membername;

    private String membertel;

    private String membersex;

    private Boolean isadmin;
}
