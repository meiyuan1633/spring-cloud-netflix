package com.wei.spring.cloud.netflix.business;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/*与provider通信*/
@FeignClient(value = "provider-admin")
public
interface BusinessAdminFeign {

    @GetMapping(value = "/hi")
    String sayHi();

}
