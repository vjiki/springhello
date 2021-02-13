package com.github.vjiki.springhello;


import com.github.vjiki.springhello.builder.BuilderConfig;
import com.github.vjiki.springhello.builder.House;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(BuilderConfig.class);

        House house = context.getBean(House.class);

        house.buildWall();

        house.view();

        context.close();
    }
}