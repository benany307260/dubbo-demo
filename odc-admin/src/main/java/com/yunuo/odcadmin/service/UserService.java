package com.yunuo.odcadmin.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yunuo.odcadmin.domain.entity.User;
import com.yunuo.odcadmin.domain.repository.UserRepository;

@Service
@Transactional
public class UserService {
	
    @Autowired
    private UserRepository userRepository;
    
    
    
    public boolean add(User user){
        userRepository.save(user);
        return true;
    }
    
    public String addUser(String account){
        User user = new User();
        user.setAccount(account);
        userRepository.save(user);
        return "添加成功！";
    }
    
    public User getOneUser(Long id){
        return userRepository.findById(id).get();
    }
    
    public List<User> findAll(){
    	return userRepository.findAll();
    }
    
}