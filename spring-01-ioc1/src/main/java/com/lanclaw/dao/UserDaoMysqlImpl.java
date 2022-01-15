package com.lanclaw.dao;

public class UserDaoMysqlImpl implements UserDao{

    @Override
    public void getUser() {
        System.out.println("Mysql读取用户数据");
    }
}
