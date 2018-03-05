package com.chenzf.service_feign;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements ServiceFeignApplication.SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name){
        return "sorry,"+name+",error!";
    }

}
