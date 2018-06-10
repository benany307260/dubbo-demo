package com.testcomp.impl;
import org.springframework.stereotype.Service;

import com.testcomp.test.DemoService;

@Service("demoService")
public class DemoServiceImpl implements DemoService{

    public String sayHello(String name) {
        return name; 
    }  
}