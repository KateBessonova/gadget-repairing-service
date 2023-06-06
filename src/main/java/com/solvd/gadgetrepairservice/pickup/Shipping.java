package com.solvd.gadgetrepairservice.pickup;

public class Shipping {
    private String address;
    private String lastname;

    public Shipping (String address, String lastname) {
        this.address = address;
        this.lastname = lastname;
    }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public String getLastname() {

        return lastname;
    }

    public void setLastname(String lastname) {

        this.lastname = lastname;
    }
}
