package com.solvd.gadgetrepairservice.order;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class ReflectionDataGenerator {
    public static void main(String[] args) {
        try {

            Class<?> orderClass = Order.class;


            Constructor<?> orderConstructor = orderClass.getConstructor(String.class, String.class, String.class, boolean.class, double.class);


            Object[] constructorArgs = {"John Doe", "iPhone", "Screen Replacement", true, 100.0};
            Order order = (Order) orderConstructor.newInstance(constructorArgs);


            Field fixTypeBaseCostMapField = orderClass.getDeclaredField("fixTypeBaseCostMap");
            fixTypeBaseCostMapField.setAccessible(true);
            Map<String, Double> fixTypeBaseCostMap = (Map<String, Double>) fixTypeBaseCostMapField.get(null);
            fixTypeBaseCostMap.put("Speaker Replacement", 80.0);

            // Print the generated data
            System.out.println("Generated Order data:");
            System.out.println("Customer: " + order.customer);
            System.out.println("Device: " + order.device);
            System.out.println("Fix Type: " + order.fixType);
            System.out.println("Expedited Delivery: " + order.expeditedDelivery);
            System.out.println("Calculated Estimated Cost: " + order.calculatedEstimatedCost);


            System.out.println("\nGenerated Order data (using reflection):");
            Field[] fields = orderClass.getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                System.out.println(field.getName() + ": " + field.get(order));
            }
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}