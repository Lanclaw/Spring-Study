package com.lanclaw.service;

import com.lanclaw.dao.UserDao;
import com.lanclaw.dao.UserDaoImpl;
import com.lanclaw.dao.UserDaoMysqlImpl;

public class UserServiceImpl implements UserService{

    private UserDao userDao;

    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public void getUser(){
        userDao.getUser();
    }
}
