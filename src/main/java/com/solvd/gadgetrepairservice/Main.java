package com.solvd.gadgetrepairservice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Comparator;
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
        Order order = new Order("John Doe", "iPhone", "Screen Replacement", true, 100);
        int count = Customer.getCustomerCount();

        InPerson pickup = new InPerson(true, "Jonsons");

        Verification verification = (p) -> {
            return p.getLastName().equals("Doe");

        };


        //Order order = new Order("John Doe", "iPhone", "Screen Replacement", true, 100);
        double estimatedCost = order.calculateEstimatedCost();
        System.out.println("Estimated Cost: $" + estimatedCost);


        Constructor<?> orderConstructor = orderClass.getConstructor(String.class, String.class, String.class, boolean.class, double.class);

        Object[] constructorArgs = {"John Doe", "iPhone", "Screen Replacement", true, 100.0};
        Order = (Order) orderConstructor.newInstance(constructorArgs);

        System.out.println("\nGenerated Order data (using reflection):");
        Field[] fields = orderClass.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            System.out.println(field.getName() + ": " + field.get(Order));
        }

        List<Device> devices = new ArrayList<>();
        devices.add(new Laptop("Apple", 14));
        devices.add(new Laptop("Bose", 16));
        devices.add(new Phone("Google", "GooglePhone"));
        devices.add(new Phone("Samsung", "S23"));


        List<String> printBrands = device.stream()
                .filter(device -> device instanceof Laptop)
                .map(device -> device.getBrand())
                .collect(Collectors.toList());
        logger.info("Laptop brands: {} ", laptop.getBrand());

        List<String> phoneModels= devices.stream()
                .filter(device -> device instanceof Phone)
                .map(device -> device.getModel())
                .collect(Collectors.toList());

        logger.info("Estimated Cost: ${}", order.calculateEstimatedCost());
        logger.info("Brand {}", laptop.getBrand());
        logger.info("ScreenSize {}", laptop.getScreenSize());
        logger.info("Brand {}", phone.getBrand());
        logger.info("Model {}", phone.getModel());
        logger.info("FirstName {}", customer.getFirstName());
        logger.info("LastName {}", customer.getLastName());
        logger.info("Email {}", customer.getEmail());
        logger.info("FirstName {}", employee.getFirstName());
        logger.info("LastName {}", employee.getLastName());
        logger.info("BatteryType {}", charging.getBatteryType());
        logger.info("Capacity {}", charging.getBatteryCapacity());
        logger.info("FastDelivery {}", expedited.getFastDelivery());
        logger.info("Days {}", expedited.getDays());
        logger.info("{}");
    }
}
