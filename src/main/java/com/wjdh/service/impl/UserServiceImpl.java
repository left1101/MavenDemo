package com.wjdh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wjdh.dao.UserMapper;
import com.wjdh.entity.User;
import com.wjdh.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public void create(User user) {
		userMapper.insert(user);
	}

}
