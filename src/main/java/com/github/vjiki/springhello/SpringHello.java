package com.github.vjiki.springhello;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringHello {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppContext.class);

        PersonBean person = context.getBean(PersonBean.class);

        System.out.println(person.getName() + " " + person.getAge());

        context.close();
    }
}