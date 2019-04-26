package com.hero.consumer.common;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;

/**
 * @Des:
 * @Auther: 飞狐
 * @Date: 2019-04-25
 */
@JsonSerialize(
        include = JsonSerialize.Inclusion.NON_NULL
)
public class BaseDo implements Serializable {
    public BaseDo(){

    }
}
