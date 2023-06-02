package com.solvd.gadgetrepairservice.people;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Employee {
    private String firstName;
    private String lastName;
    private String email;
    private static final Logger logger  = LogManager.getLogger(Employee.class);


    public Employee(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName =lastName;
        this.email =email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        logger.info("Updated first name: " + firstName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        logger.info("Updated last name: " + lastName);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        logger.info("Updated email:  " + email);
    }
}
