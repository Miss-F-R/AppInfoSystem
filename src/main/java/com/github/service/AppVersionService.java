package com.github.service;

import com.github.pojo.AppVersion;

import java.util.List;

public interface AppVersionService {
    List<AppVersion> appversionadd(int id);

    AppVersion findAppVersionById(int vid);
}
