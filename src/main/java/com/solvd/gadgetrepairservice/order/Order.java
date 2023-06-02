package com.solvd.gadgetrepairservice.order;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class Order implements Calculatable {
    public String customer;
    public String device;
    public String fixType;
    public boolean expeditedDelivery;
    public double calculatedEstimatedCost;
    public static final Logger logger = LogManager.getLogger(Order.class);

    public static final Map<String, Double> fixTypeBaseCostMap = new HashMap<>();

    static {
        fixTypeBaseCostMap.put("Screen Replacement", 100.0);
        fixTypeBaseCostMap.put("Battery Replacement", 50.0);
        fixTypeBaseCostMap.put("Software Update", 20.0);
    }

    public Order(String customer, String device, String fixType, boolean expeditedDelivery, double calculatedEstimatedCost) {
        this.customer = customer;
        this.device = device;
        this.fixType = fixType;
        this.expeditedDelivery = expeditedDelivery;
        this.calculatedEstimatedCost = calculatedEstimatedCost;
    }

    @Override
    public double calculateEstimatedCost() {
        double baseCost = fixTypeBaseCostMap.getOrDefault(fixType, 0.0);
        double deliveryCost = expeditedDelivery ? 10.0 : 5.0;
        double estimatedCost = baseCost + deliveryCost;
        logger.info("Estimated cost: {}", estimatedCost);
        return estimatedCost;
    }

    public static void main(String[] args) {
        Order order = new Order("John Doe", "iPhone", "Screen Replacement", true, 100);
        double estimatedCost = order.calculateEstimatedCost();
        System.out.println("Estimated Cost: $" + estimatedCost);
    }
}