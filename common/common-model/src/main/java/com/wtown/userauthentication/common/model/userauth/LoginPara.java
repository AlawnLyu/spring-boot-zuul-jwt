/**
 * @author LYU
 * @create 2017年11月10日 9:53
 * @Copyright(C) 2010 - 2017 GBSZ
 * All rights reserved
 */

package com.wtown.userauthentication.common.model.userauth;

public class LoginPara {

    private String user_name;

    private String pwd;

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "LoginPara{" +
                "user_name='" + user_name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
