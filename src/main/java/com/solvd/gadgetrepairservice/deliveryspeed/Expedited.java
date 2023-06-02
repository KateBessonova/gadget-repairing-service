package com.solvd.gadgetrepairservice.deliveryspeed;

public class Expedited {
    private String fastDelivery;
    private int days;

    public Expedited(String fastDelivery, int days) {
        this.fastDelivery= fastDelivery;
        this.days = days;
    }

    public String getFastDelivery() {
        return fastDelivery;
    }

    public void setFastDelivery(String fastDelivery) {
        this.fastDelivery = fastDelivery;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
