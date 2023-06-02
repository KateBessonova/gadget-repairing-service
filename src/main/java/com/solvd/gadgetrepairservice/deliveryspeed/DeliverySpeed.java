package com.solvd.gadgetrepairservice.deliveryspeed;

public class DeliverySpeed {
    private String speed;
    private int days;
    public DeliverySpeed(String speed, int days) {
        this.speed= speed;
        this.days =days;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
