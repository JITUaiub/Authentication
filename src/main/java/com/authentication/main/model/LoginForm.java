package com.authentication.main.model;

public class LoginForm {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
    	if(password.equals("admin"))
        return password;
    	return null;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}