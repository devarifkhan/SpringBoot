package com.devarifkhan.main;

import com.devarifkhan.beans.Person;
import com.devarifkhan.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("Before retrieving the Person bean from the Spring Context");
        Person person = context.getBean(Person.class);
        System.out.println("After retrieving the Person bean from the Spring Context");
    }
}