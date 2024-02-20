package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserInfoRepository;
import com.model.User;

@Service
public class UserInfoServiceImplmentation implements UserInfoService{

	@Autowired
	UserInfoRepository userinfo;
	
	
	@Override
	public User saveUser(User userInfo) {
		// TODO Auto-generated method stub
		return userinfo.save(userInfo);
	}
	
	
	

}
