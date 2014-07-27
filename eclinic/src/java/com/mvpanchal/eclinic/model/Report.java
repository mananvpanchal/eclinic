package com.mvpanchal.eclinic.model;

/**
 *
 * @author Manan
 */
public class Report {

    public String getInWhatPosition() {
        return inWhatPosition;
    }

    public void setInWhatPosition(String inWhatPosition) {
        this.inWhatPosition = inWhatPosition;
    }

    public String getOfWhatPart() {
        return ofWhatPart;
    }

    public void setOfWhatPart(String ofWhatPart) {
        this.ofWhatPart = ofWhatPart;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    protected String type;
    protected String ofWhatPart;
    protected String inWhatPosition;
    
}
