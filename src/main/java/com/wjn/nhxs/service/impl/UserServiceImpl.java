package com.wjn.nhxs.service.impl;

import com.wjn.nhxs.dao.UserDao;
import com.wjn.nhxs.domain.User;
import com.wjn.nhxs.service.UserService;

import javax.annotation.Resource;

public class UserServiceImpl implements UserService{
    @Resource
    private UserDao userDao;

    /** 用户注册 */
    public void regist(User user) {
        userDao.insert(user);
    }

    /** 用户登录 */
    public User login(String username, String password) {
        return userDao.verifyUser(username, password);
    }

}
