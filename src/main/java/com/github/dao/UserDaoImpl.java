package com.github.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{

    @Override
    public int addUser() {
        return 1;
    }
}
