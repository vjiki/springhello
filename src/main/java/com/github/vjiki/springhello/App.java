package com.github.vjiki.springhello;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //Window window = context.getBean("windowBean", Window.class);
        //new House(window).view(); // ручное внедрение

        House house = context.getBean("houseBean", House.class);

        house.buildWall();
        house.installDoors();
        house.installDoorsWithKey();
        house.view();
        System.out.printf("House height %d \n", house.getHeight());

        MainWindow window = context.getBean(MainWindow.class);

        window.show();

        System.out.println("House is the same in context : " + context.getBean("houseBean", House.class));
        System.out.println("House is the same in context : " + context.getBean("houseBean", House.class));

        System.out.println("Brick : " + context.getBean("brickBean", Brick.class));
        System.out.println("Brick : " + context.getBean("brickBean", Brick.class));
        System.out.println("Brick : " + context.getBean("brickBean", Brick.class));


        context.close();
    }
}