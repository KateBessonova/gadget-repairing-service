package com.solvd.gadgetrepairservice.order;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.BasicConfigurator;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class ReflectionDataGenerator {
    public static void main(String[] args) {
        try {
            //BasicConfigurator.configure();
            Class<?> orderClass = Order.class;

            final Logger logger = LogManager.getLogger(String.valueOf(ReflectionDataGenerator.class));
            Constructor<?> orderConstructor = orderClass.getConstructor(String.class, String.class, String.class, boolean.class, double.class);


            Object[] constructorArgs = {"John Doe", "iPhone", "Screen Replacement", true, 100.0};
            Order order = (Order) orderConstructor.newInstance(constructorArgs);


            Field fixTypeBaseCostMapField = orderClass.getDeclaredField("fixTypeBaseCostMap");
            fixTypeBaseCostMapField.setAccessible(true);
            Map<String, Double> fixTypeBaseCostMap = (Map<String, Double>) fixTypeBaseCostMapField.get(null);
            fixTypeBaseCostMap.put("Speaker Replacement", 80.0);

            // Print the generated data

            logger.info("Generated Order data:");
            logger.info("Customer: " + order.customer);
            logger.info("Device: " + order.device);
            logger.info("Fix Type: " + order.fixType);
            logger.info("Expedited Delivery: " + order.expeditedDelivery);
            logger.info("Calculated Estimated Cost: " + order.calculatedEstimatedCost);
            logger.info("\nGenerated Order data (using reflection):");


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
