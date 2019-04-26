package com.hero.consumer.common;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.validation.constraints.NotNull;

/**
 * @Des:
 * @Auther: 飞狐
 * @Date: 2019-04-25
 */
public class Result<T> extends BaseDo{
    private int status = 0;
    private String msg;
    private T res;

    public Result() {
    }

    public Result(T res) {
        this.res = res;
    }

    public Result(@NotNull ErrorCode errorCode) {
        this.status = errorCode.getStatus();
        this.msg = errorCode.getMsg();
    }

    public Result(@NotNull int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public Result(@NotNull ErrorCode errorCode, T res) {
        this.status = errorCode.getStatus();
        this.msg = errorCode.getMsg();
        this.res = res;
    }

    @JsonIgnore
    public boolean isSuccess() {
        return this.status == 0;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getRes() {
        return this.res;
    }

    public void setRes(T res) {
        this.res = res;
    }
}
