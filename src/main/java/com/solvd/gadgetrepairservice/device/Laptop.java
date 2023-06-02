package com.solvd.gadgetrepairservice.device;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Laptop {
    private String brand;
    private int screenSize;
    private static final Logger logger = LogManager.getLogger(Laptop.class);

    public Laptop(String brand, int screenSize) {
        this.brand = brand;
        this.screenSize = screenSize;
    }

    public String getBrand() {
        logger.info("Get thee brand: {}", brand);
        return brand;
    }

    public void setBrand(String brand) {
        logger.info("Set the brand: {}", brand);
        this.brand = brand;
    }

    public int getScreenSize() {
        logger.info("Get screen size: {}", screenSize);
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        logger.info("Setting screen size: {}", screenSize);
        this.screenSize = screenSize;
    }
}

