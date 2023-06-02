package com.solvd.gadgetrepairservice.people;


import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Customer {
    public String firstName;
    public String lastName;
    public String email;
    public static int customerCount;
    public static final Logger logger = LogManager.getLogger();


    public Customer (String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        customerCount++;
        logger.info("New customer created: " + firstName + "" +lastName);
    }

    public static int getCustomerCount() {

        return customerCount;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        logger.info("Updated first name:" + firstName + "" + lastName);
        logger.info("Updated last name:" + firstName + "" + lastName);
    }

    public String getLastName() {
        logger.info("Updated last name:" + firstName + "" + lastName);
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        logger.info("Updated email: " + firstName + " " + lastName);
    }
}

