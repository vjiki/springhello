package com.github.vjiki.springhello;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("appAnnotationContext.xml");

        //Window window = context.getBean("windowBean", Window.class);
        //new House(window).view(); // ручное внедрение

        House house = context.getBean(House.class);

        house.buildWall();


        context.close();
    }
}