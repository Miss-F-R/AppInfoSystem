package com.github.service;

import com.github.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService{
    @Resource
    private UserDao ud;

    @Override
    public boolean addUser() {
        if (ud.addUser()>0){
            return true;
        }
        return false;
    }
}
