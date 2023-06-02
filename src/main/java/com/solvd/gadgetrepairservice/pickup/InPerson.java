package com.solvd.gadgetrepairservice.pickup;

public class InPerson implements Identification {
    public boolean person;
    public  String lastName;
    public static final int MAX_ATTEMPTS = 3;

    public InPerson(boolean person, String lastName) {
        this.person = person;
        this.lastName = lastName;
    }



    public void setPerson(boolean person) {
        this.person = person;
    }

    @Override
    public boolean isPerson() {
        return false;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public static int getMaxAttempts() {
        return MAX_ATTEMPTS;
    }
}