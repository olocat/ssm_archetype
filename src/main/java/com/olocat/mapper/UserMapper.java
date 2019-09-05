package com.olocat.mapper;

import com.olocat.pojo.User;

import java.util.List;

public interface UserMapper {
	User getUser();
	List<User> getUserList();
}
