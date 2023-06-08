package com.solvd.gadgetrepairservice.device;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Device {
    private String brand;
    private String model;

    public static final Logger logger = LogManager.getLogger(String.valueOf(Device.class));
    public Device(String brand,String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        logger.info("Get the brand: " + brand);
        return brand;
    }

    public void setBrand(String brand) {
        logger.info("Set the brand: " + brand);
        this.brand = brand;
    }

    public String getModel() {
        logger.info("Get the model: " + model);
        return model;
    }

    public void setModel (String model){
        logger.info("Set the model: " + model);
        this.model = model;
    }

}

