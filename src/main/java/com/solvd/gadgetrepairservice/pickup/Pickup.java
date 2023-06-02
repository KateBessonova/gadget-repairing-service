package com.solvd.gadgetrepairservice.pickup;

public class Pickup {
    private String pickupAddress;
    private String pickupDate;
    private String pickupTime;

    public String Pickup(String pickupAddress, String pickupDate, String pickupTime) {
        this.pickupAddress = pickupAddress;
        this.pickupDate = pickupDate;
        this.pickupTime = pickupTime;

        public String getPickupAddress{
            return pickupAddress;
        }

        public void setPickupAddress(String pickupAddress){
            this.pickupAddress = pickupAddress;
        }

        public String getPickupDate() {
            return pickupDate;
        }

        public void setPickupDate (String pickupDate){
            this.pickupDate = pickupDate;
        }

        public String getPickupTime () {
            return pickupTime;
        }

        public void setPickupTime (String pickupTime){
            this.pickupTime = pickupTime;
        }


    }