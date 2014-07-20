package com.mvpanchal.eclinic.model;

import org.mvpanchal.zefw.model.Model;
import org.mvpanchal.zefw.model.ModelInfo;

/**
 *
 * @author Manan
 */
public class Patient implements Model {

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    protected String caseNo;
    protected String name;
    protected String address;
    protected int age;
    protected String phoneNo;
    protected String sex;
    
    public void actionInit(ModelInfo info) {
        
    }

    public void viewInit() {
        
    }

}
