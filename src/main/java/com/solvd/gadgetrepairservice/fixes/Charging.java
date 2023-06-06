package com.solvd.gadgetrepairservice.fixes;

public class Charging extends Fixes {
    private String batteryType;
    private int batteryCapacity;



    public Charging(String batteryType, int batteryCapacity) {
        super();
        this.batteryType = batteryType;
        this.batteryCapacity = batteryCapacity;
    }


    public String getBatteryType() {

        return batteryType;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
}

