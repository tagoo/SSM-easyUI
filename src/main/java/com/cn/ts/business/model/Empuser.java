package com.cn.ts.business.model;

public class Empuser extends EmpuserKey {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
}