package com.mvpanchal.eclinic.model;

import org.mvpanchal.zefw.model.Model;
import org.mvpanchal.zefw.model.ModelInfo;

/**
 *
 * @author Manan
 */
public class Case implements Model {

    public String getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo;
    }

    public Medical[] getMedicals() {
        return medicals;
    }

    public void setMedicals(Medical[] medicals) {
        this.medicals = medicals;
    }
    
    protected String caseNo;
    protected Medical[] medicals;

    public void actionInit(ModelInfo info) {
        
    }

    public void viewInit() {
        
    }

}
