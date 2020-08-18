package com.github.service.backend;

import com.github.dao.backend.BackendUserMapper;
import com.github.pojo.BackendUser;

import javax.annotation.Resource;

public class BackendUserServiceImpl implements BackendUserService{
    @Resource
    private BackendUserMapper backendUserMapper;
    @Override
    public BackendUser doLogin(String userCode, String userPassword) {
        return backendUserMapper.doLogin(userCode,userPassword);
    }
}
