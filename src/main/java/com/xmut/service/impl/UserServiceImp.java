package com.xmut.service.impl;

import com.xmut.dao.UserDao;
import com.xmut.service.UserService;

public class UserServiceImp implements UserService {

    UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public boolean login(String name, String password) {
        return userDao.login(name,password);
    }
}
