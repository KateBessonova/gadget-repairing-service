package com.solvd.gadgetrepairservice.device;

public class Phone extends Device{
    private String brand;
    private String model;



    public Phone(String brand, String model) {
        super(brand,model);
        this.brand = brand;
        this.model = model;
    }


}
