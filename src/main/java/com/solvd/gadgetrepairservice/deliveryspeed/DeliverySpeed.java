package com.solvd.gadgetrepairservice.deliveryspeed;
import com.solvd.gadgetrepairservice.exception.InvalidDeliverySpeed;

public abstract class DeliverySpeed {
    private String speed;
    private int days;

    public DeliverySpeed(String speed, int days) {
        if (isValidSpeed(speed)) {
            this.speed = speed;
            this.days = days;
        } else {
            throw new InvalidDeliverySpeed("Invalid delivery speed: " + speed);
        }
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        if (isValidSpeed(speed)) {
            this.speed = speed;
        } else {
            throw new InvalidDeliverySpeed("Invalid delivery speed: " + speed);
        }
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    private boolean isValidSpeed(String speed) {
        return speed != null && !speed.isEmpty();
    }
}

