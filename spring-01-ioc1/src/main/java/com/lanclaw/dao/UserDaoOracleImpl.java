package com.lanclaw.dao;

public class UserDaoOracleImpl implements UserDao{

    @Override
    public void getUser() {
        System.out.println("oracle 读取用户数据");
    }
}
