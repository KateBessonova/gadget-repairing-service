package com.solvd.gadgetrepairservice;

import com.solvd.gadgetrepairservice.device.Device;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import com.solvd.gadgetrepairservice.deliveryspeed.Expedited;
import com.solvd.gadgetrepairservice.device.Laptop;
import com.solvd.gadgetrepairservice.device.Phone;
import com.solvd.gadgetrepairservice.exception.InvalidFixTypeException;
import com.solvd.gadgetrepairservice.fixes.Charging;
import com.solvd.gadgetrepairservice.fixes.Screen;
import com.solvd.gadgetrepairservice.order.Order;
import com.solvd.gadgetrepairservice.people.Customer;
import com.solvd.gadgetrepairservice.people.Employee;
import com.solvd.gadgetrepairservice.pickup.Identification;
import com.solvd.gadgetrepairservice.pickup.InPerson;
import com.solvd.gadgetrepairservice.pickup.Shipping;
import com.solvd.gadgetrepairservice.pickup.Verification;
//import org.apache.log4j.PropertyConfigurator;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        Laptop laptop = new Laptop("Samsung", 14);
        Phone phone = new Phone("IPhone", "ProMax");
        Customer customer = new Customer("Ann", "Smith", "Ann@email");
        Employee employee = new Employee("John", "Lock", "John@email");
        Charging charging = new Charging("Lithium-Ion", 80);
        Screen screen = new Screen("Broken", 40);
        Expedited expedited = new Expedited("DeliverFast", 5);
        InPerson inPerson = new InPerson(true, "Smith");
        Shipping shipping = new Shipping("North Main St", "Adams");
        Order order1 = new Order("John Doe", "iPhone", "Screen Replacement", true, 100);
        int count = Customer.getCustomerCount();

        InPerson pickup = new InPerson(true, "Jonsons");

        Verification verification = (p) -> {
            return p.getLastName().equals("Doe");

        };


        Order order2 = new Order("John Doe", "iPhone", "Screen Replacement", true, 100);
        double estimatedCost = order2.calculateEstimatedCost();.calculateEstimatedCost();
        logger.info("Estimated Cost:" + estimatedCost);

        logger.info("Estimated Cost:" + estimatedCost);

        try {
            Constructor<Order> orderConstructor = Order.class.getConstructor(String.class, String.class, String.class, boolean.class, double.class);
            Object[] constructorArgs = {"John Doe", "iPhone", "Screen Replacement", true, 100.0};
            Order orderReflection = orderConstructor.newInstance(constructorArgs);

            logger.info("\nGenerated Order data (using reflection):");
            Field[] fields = Order.class.getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                logger.info(field.getName() + ": " + field.get(order2));
            }
        } catch (Exception e) {
            logger.error("Error creating order using reflection: {}" + e.getMessage());
        }

        List<Device> devices = new ArrayList<>();
        devices.add(new Laptop("Apple", 14,"M1"));
        devices.add(new Laptop("Bose", 16,"B2322"));
        devices.add(new Phone("Google", "GooglePhone"));
        devices.add(new Phone("Samsung", "S23"));


        List<String> laptopBrands = devices.stream()
                .filter(device -> device instanceof Laptop)
                .map(device -> device.getBrand())
                .collect(Collectors.toList());
        logger.info("Laptop brands: " + laptopBrands);

        List<String> phoneModels = devices.stream()
                .filter(device -> device instanceof Phone)
                .map(device -> device.getModel())
                .collect(Collectors.toList());
        logger.info("Phone Models: " + phoneModels);

        logger.info("Estimated Cost:"+ order2.calculateEstimatedCost());
        logger.info("Brand "+ laptop.getBrand());
        logger.info("ScreenSize "+ laptop.getScreenSize());
        logger.info("Brand "+ phone.getBrand());
        logger.info("Model "+ phone.getModel());
        logger.info("FirstName "+ customer.getFirstName());
        logger.info("LastName "+customer.getLastName());
        logger.info("Email "+ customer.getEmail());
        logger.info("FirstName "+ employee.getFirstName());
        logger.info("LastName "+ employee.getLastName());
        logger.info("BatteryType "+ charging.getBatteryType());
        logger.info("Capacity "+ charging.getBatteryCapacity());
        logger.info("FastDelivery "+ expedited.getSpeed());
        logger.info("Days "+ expedited.getDays());
        logger.info("{}");
    }
}




