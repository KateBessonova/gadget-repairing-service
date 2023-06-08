package com.solvd.gadgetrepairservice.device;

public class Laptop extends Device{
    private int screenSize;
    private String brand;
    private String model;
    //private static final Logger logger = LogManager.getLogger(String.valueOf(Laptop.class));

    public Laptop(String brand, int screenSize, String model) {
        super(brand,model);
        this.screenSize = screenSize;
    }

    public int getScreenSize() {
        logger.info("Get screen size:" + screenSize);
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        logger.info("Setting screen size:" + screenSize);
        this.screenSize = screenSize;
    }
}
