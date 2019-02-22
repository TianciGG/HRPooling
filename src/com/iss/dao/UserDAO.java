package com.iss.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.iss.DBUtil.DBUtil;
import com.iss.modal.UserInfo;

public class UserDAO {
	// 实例化数据库访问的工具类
	private DBUtil dbutil = new DBUtil();

	public Boolean save(UserInfo userInfo) {
		// 按照PrepareStatement格式要求写SQL，即用问号代替即将传入的参数
		String SQL = "insert into t_user(userName,uPassword) values(?,?)";
		int num = dbutil.update(SQL, userInfo.getUserName(), userInfo.getuPassword());
		if (num > 0) {
			return true;
		} else {
			return false;
		}
	}

	public Boolean update(UserInfo userInfo) {
		// 按照PrepareStatement格式要求写SQL，即用问号代替即将传入的参数
		String SQL = "update t_user set userName=?,uPassword=? where userId=?";
		int num = dbutil.update(SQL, userInfo.getUserName(), userInfo.getuPassword(), userInfo.getUserId());
		if (num > 0) {
			return true;
		} else {
			return false;
		}

	}

	public Boolean delete(Integer UserId) {
		// 按照PrepareStatement格式要求写SQL，即用问号代替即将传入的参数
		String SQL = "delete from t_user where userId=?";
		int num = dbutil.update(SQL, UserId);
		if (num > 0) {
			return true;
		} else {
			return false;
		}
	}

	public List<UserInfo> getAllUser() {
		// 实例化List<UserInfo>对象
		List<UserInfo> userList = new ArrayList<UserInfo>();
		String SQL = "select  * from t_user";
		ResultSet rs = dbutil.query(SQL);

		try {
			while (rs.next()) {
				UserInfo userInfo = new UserInfo();
				// 使用rs.get类型（“列名”）获取数据；
				userInfo.setUserId(rs.getInt("userId"));
				userInfo.setUserName(rs.getString("userName"));
				userInfo.setuPassword(rs.getString("uPassword"));
				// 把单个对象加载到泛型集合中
				userList.add(userInfo);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userList;
	}
}
