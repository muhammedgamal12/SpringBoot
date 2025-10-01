package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");

        Circle circle = container.getBean("circle",Circle.class);
        circle.drawCircle(circle);

        Square square = container.getBean("rectangle", Square.class);
        square.drawRectangle(square);












    }
}