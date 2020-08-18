package com.github.dao;

import com.github.pojo.AppVersion;

import java.util.List;

public interface AppVersionMapper {
    List<AppVersion> appversionadd(int id);

    AppVersion findAppVersionById(int vid);
}
