package com.example.udacitycourseapplication;

public class Earthquake {
    private String mag,loc,date;

    public Earthquake(String mag,String loc,String date) {
        this.mag=mag;
        this.loc=loc;
        this.date=date;
    }

    public String getMag() {
        return mag;
    }

    public String getDate() {
        return date;
    }

    public String getLoc() {
        return loc;
    }
}
