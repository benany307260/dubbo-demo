package com.testcomp.impl;
import org.springframework.stereotype.Service;

import com.testcomp.test.DemoService;

@Service("demoService")
public class DemoServiceImpl implements DemoService{

    public String sayHello(String name) {
        return "经过dubbo服务提供者啦，调用传入的名字："+name; 
    }  
}