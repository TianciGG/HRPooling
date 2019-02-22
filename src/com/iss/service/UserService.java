package com.iss.service;

import java.util.ArrayList;
import java.util.List;

import com.iss.dao.UserDAO;
import com.iss.modal.UserInfo;

public class UserService {
	// 实例化一个UserDAO
	private UserDAO userDao = new UserDAO();

	// 增
	public boolean save(UserInfo userInfo) {
		Boolean flag = false;
		userDao.save(userInfo);
		return flag;
	}

	// 改
	public Boolean update(UserInfo userInfo) {
		Boolean flag = false;
		userDao.update(userInfo);
		return flag;
	}

	// 删
	public Boolean delete(Integer userId) {
		Boolean flag = false;
		userDao.delete(userId);
		return flag;

	}

	// 查
	public List<UserInfo> getAllUser() {
		List<UserInfo> userList = new ArrayList<UserInfo>();
		userList = userDao.getAllUser();
		return userList;
	}

}