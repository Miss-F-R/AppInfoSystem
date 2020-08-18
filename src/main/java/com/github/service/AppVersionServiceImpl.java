package com.github.service;

import com.github.dao.AppVersionMapper;
import com.github.pojo.AppVersion;

import javax.annotation.Resource;
import java.util.List;

public class AppVersionServiceImpl implements AppVersionService{
    @Resource
    private AppVersionMapper appVersionMapper;
    @Override
    public List<AppVersion> appversionadd(int id) {
        return appVersionMapper.appversionadd(id);
    }

    @Override
    public AppVersion findAppVersionById(int vid) {
        return appVersionMapper.findAppVersionById(vid);
    }
}
