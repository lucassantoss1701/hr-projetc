package com.lucas.hrpayroll.entities;

import java.io.Serializable;

public class Payment implements Serializable {

    private String name;
    private Double dailyIcome;
    private Integer days;

    public Payment(){

    }

    public Payment(String name, Double dailyIcome, Integer days) {
        this.name = name;
        this.dailyIcome = dailyIcome;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDailyIcome() {
        return dailyIcome;
    }

    public void setDailyIcome(Double dailyIcome) {
        this.dailyIcome = dailyIcome;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public double getTotal(){
        return days * dailyIcome;
    }
}
