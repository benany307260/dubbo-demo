package com.testcomp.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testcomp.dao.UserService;
import com.testcomp.entity.User;
import com.testcomp.test.DemoService;

@Service("demoService")
public class DemoServiceImpl implements DemoService{

	@Autowired  
    private UserService userService;
	
    public String sayHello(String name) {
        return "经过dubbo服务提供者啦，调用传入的名字："+name; 
    }

	public List<User> findAllUser() {
		try {
			List<User> userList = userService.findAll();
			return userList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}  
}