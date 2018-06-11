package com.testcomp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testcomp.entity.User;

public interface IUserDao extends JpaRepository<User, Long> {
	
}
