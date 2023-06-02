package com.solvd.gadgetrepairservice.deliveryspeed;

public class Standard {
    private String groundDelivery;
    private int days;
    public Standard(String groundDelivery, int days) {
        this.groundDelivery = groundDelivery;
        this.days = days;
    }

    public String getGroundDelivery() {
        return groundDelivery;
    }

    public void setGroundDelivery(String groundDelivery) {
        this.groundDelivery = groundDelivery;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
