package com.mvpanchal.eclinic.model;

import org.mvpanchal.zefw.model.Model;
import org.mvpanchal.zefw.model.ModelInfo;

/**
 *
 * @author Manan
 */
public class User implements Model {

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    protected String username;
    protected String password;
    protected UserType userType;

    public void actionInit(ModelInfo info) {
        
    }

    public void viewInit() {
        
    }

}
