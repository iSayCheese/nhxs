package com.wjn.nhxs.service;

import com.wjn.nhxs.domain.User;

public interface UserService {


	/** 用户注册 */
	void regist(User user);

	/** 用户登录 */
	User login(String username, String password);
}
