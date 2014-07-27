package com.mvpanchal.eclinic.model;

/**
 *
 * @author Manan
 */
public class Medicine {

    public int getForDays() {
        return forDays;
    }

    public void setForDays(int forDays) {
        this.forDays = forDays;
    }

    public int getHowManyTimes() {
        return howManyTimes;
    }

    public void setHowManyTimes(int howManyTimes) {
        this.howManyTimes = howManyTimes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWhenToTake() {
        return whenToTake;
    }

    public void setWhenToTake(String whenToTake) {
        this.whenToTake = whenToTake;
    }

    public String getWithWhatToTake() {
        return withWhatToTake;
    }

    public void setWithWhatToTake(String withWhatToTake) {
        this.withWhatToTake = withWhatToTake;
    }
    
    protected String name;
    protected int forDays;
    protected int howManyTimes;
    protected String whenToTake;
    protected String withWhatToTake;
    
}
