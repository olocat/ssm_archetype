package com.olocat.service;

import com.olocat.pojo.User;

import java.util.List;

public interface UserService {
	User getUser();
	List<User> getUserList();
}
