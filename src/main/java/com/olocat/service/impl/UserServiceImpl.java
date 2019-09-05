package com.olocat.service.impl;

import com.olocat.mapper.UserMapper;
import com.olocat.pojo.User;
import com.olocat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

	@Autowired(required = false)
	private UserMapper userMapper;

	@Override
	public User getUser() {
		return userMapper.getUser();
	}

	@Override
	public List<User> getUserList() {
		return userMapper.getUserList();
	}
}
