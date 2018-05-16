package com.wjn.nhxs.dao;

import com.wjn.nhxs.domain.User;

public interface UserDao {

	/** 用户注册，插入用户 */
	void insert(User user);

	/** 通过id得到用户 */
	User getById(int id);

	/** 用户登录验证 */
	User verifyUser(String username, String password);
}
