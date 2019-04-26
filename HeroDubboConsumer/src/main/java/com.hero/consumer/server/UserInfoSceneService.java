package com.hero.consumer.server;

import com.hero.common.Result;

/**
 * @Des:
 * @Auther: 飞狐
 * @Date: 2019-04-24
 */
public interface UserInfoSceneService {

    /**
     * 获取用户名称
     * @param userName
     * @return
     */
    Result getSceneUserName(String userName);


    /**
     * 获取用户年龄
     * @param age
     * @return
     */
    Result getSceneUserAge(Integer age);

    /**
     * 获取用户地址
     * @param
     * @return
     */
    Result gerSceneAddress();
}
