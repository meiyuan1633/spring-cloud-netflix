package com.wei.spring.cloud.netflix.business.controller;

import com.wei.spring.cloud.netflix.business.BusinessAdminFeign;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class BusinessAdminController {
@Resource
    private BusinessAdminFeign adminFeign;

    @GetMapping(value = "/hi")
    public String sayHi() {
        return adminFeign.sayHi();
    }

}
