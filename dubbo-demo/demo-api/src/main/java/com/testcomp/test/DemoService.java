package com.testcomp.test;

import java.util.List;

import com.testcomp.entity.User;

public interface DemoService {
	String sayHello(String name);
	
	List<User> findAllUser();
}
