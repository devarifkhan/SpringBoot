package com.devarifkhan.main;

import com.devarifkhan.beans.Vehicle;
import com.devarifkhan.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext
                (ProjectConfig.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Component Vehicle name from " +
                "Spring Context is: " + vehicle.getName());
        vehicle.printHello();
        context.close();

    }
}