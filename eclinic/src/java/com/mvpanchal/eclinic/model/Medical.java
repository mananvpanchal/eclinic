package com.mvpanchal.eclinic.model;

import java.util.Date;

/**
 *
 * @author Manan
 */
public class Medical {

    public String getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo;
    }

    public Date getDateOfVisit() {
        return dateOfVisit;
    }

    public void setDateOfVisit(Date dateOfVisit) {
        this.dateOfVisit = dateOfVisit;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getGeneralRemark() {
        return generalRemark;
    }

    public void setGeneralRemark(String generalRemark) {
        this.generalRemark = generalRemark;
    }

    public Medicine[] getMedicines() {
        return medicines;
    }

    public void setMedicines(Medicine[] medicines) {
        this.medicines = medicines;
    }

    public Report[] getReports() {
        return reports;
    }

    public void setReports(Report[] reports) {
        this.reports = reports;
    }

    public String getReportsRemark() {
        return reportsRemark;
    }

    public void setReportsRemark(String reportsRemark) {
        this.reportsRemark = reportsRemark;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }
    
    protected String caseNo;
    protected Date dateOfVisit;
    protected String symptoms;
    protected String diagnosis;
    protected Medicine[] medicines;
    protected Report[] reports;
    protected String reportsRemark;
    protected String generalRemark;
    
}
