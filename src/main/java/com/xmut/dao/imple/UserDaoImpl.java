package com.xmut.dao.imple;

import com.xmut.dao.UserDao;

public class UserDaoImpl implements UserDao {

    public boolean login(String name, String password) {
        if(name.equals("张三")&&password.equals("123"))
        {
            return true;
        }else
        {
            return false;
        }
    }
}
