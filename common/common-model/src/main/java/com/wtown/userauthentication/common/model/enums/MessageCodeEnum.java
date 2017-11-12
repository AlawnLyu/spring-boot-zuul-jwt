/**
 * @author LYU
 * @create 2017-11-10-9:35
 * @Copyright(C) 2010 - 2017 GBSZ
 * All rights reserved
 */

package com.wtown.userauthentication.common.model.enums;

public enum MessageCodeEnum implements MessageCode {

    SUCCESS(1000, "ok"),
    PARAMS_VALIDATOR_FAIL(2000, "参数错误"),
    PARAMS_FORMAT_FAIL(2001, "数据格式错误"),

    USER_EXIST(2002, "用户不存在"),
    USER_PASSWORD_WRONG(2003, "密码错误"),
    DO_NOT_HAVE_PERMISSION(2004, "当前用户没有权限"),

    SUPER_PERMISSION(9999, "超级管理员权限");

    private int code;
    private String message;

    MessageCodeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String getCode() {
        return code + "";
    }

    @Override
    public String getMessageDesc() {
        return message;
    }
}
