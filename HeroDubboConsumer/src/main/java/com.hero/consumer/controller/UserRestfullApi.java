package com.hero.consumer.controller;

import com.hero.common.Result;
import com.hero.consumer.server.UserInfoSceneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Des:
 * @Auther: 飞狐
 * @Date: 2019-04-25
 */
@RestController
public class UserRestfullApi {

    @Autowired
    private UserInfoSceneService userInfoSceneService;

    @RequestMapping(value = "hero/api/v1.0/getUserSceneAddress",method = RequestMethod.GET)
    public Result getUserSceneAddress(){
        return userInfoSceneService.gerSceneAddress();
    }

    @RequestMapping(value = "hero/api/v1.0/getUserSceneName",method = RequestMethod.GET)
    public Result getUserSceneName(@RequestParam String userName){
        return userInfoSceneService.getSceneUserName(userName);
    }


}
