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

    public String getDateOfCase() {
        return dateOfCase;
    }

    public void setDateOfCase(String dateOfCase) {
        this.dateOfCase = dateOfCase;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getMadicines() {
        return madicines;
    }

    public void setMadicines(String madicines) {
        this.madicines = madicines;
    }
    
    protected String caseNo;
    protected String dateOfCase;
    protected String diagnosis;
    protected String madicines;

    public void actionInit(ModelInfo info) {
        
    }

    public void viewInit() {
        
    }

}
