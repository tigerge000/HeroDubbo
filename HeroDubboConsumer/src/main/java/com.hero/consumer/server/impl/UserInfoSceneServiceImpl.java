package com.hero.consumer.server.impl;

import com.hero.common.Result;
import com.hero.consumer.server.UserInfoSceneService;
import com.hero.server.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Des:
 * @Auther: 飞狐
 * @Date: 2019-04-24
 */

@Service("userInfoSceneService")
public class UserInfoSceneServiceImpl implements UserInfoSceneService {


    @Resource
    private UserInfoService userInfoService;

    /**
     * 获取用户名称
     * @param userName
     * @return
     */
    @Override
    public Result getSceneUserName(String userName){
        return userInfoService.getUserName(userName);
    }


    /**
     * 获取用户年龄
     * @param age
     * @return
     */
    @Override
    public Result getSceneUserAge(Integer age){
        return userInfoService.getUserAge(age);
    }

    /**
     * 获取用户地址
     * @param
     * @return
     */
    @Override
    public Result gerSceneAddress(){
        return userInfoService.gerAddress();
    }
}
