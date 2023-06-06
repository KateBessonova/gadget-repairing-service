package com.solvd.gadgetrepairservice.people;


import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Customer extends People{
    public static int customerCount;
    public static final Logger logger = LogManager.getLogger(Customer.class);

    private ConnectionPool2.ConnectionPool connectionPool;


    public Customer (String firstName, String lastName, String email) {
        super(firstName,lastName,email);
        customerCount++;
        logger.info("New customer created: " + firstName + "" +lastName);
    }



    public Customer(ConnectionPool2.ConnectionPool connectionPool) {
        super();
        this.connectionPool = connectionPool;
    }

    public static int getCustomerCount() {
        return customerCount;
    }

}


