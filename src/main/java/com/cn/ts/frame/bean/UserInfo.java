package com.cn.ts.frame.bean;

public class UserInfo {

	private String Id;
	
	private String userName;
	
	private String passWord;

    public String getUserId() {
        return Id;
    }

    public void setUserId(String userId) {
        this.Id = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
	
}
