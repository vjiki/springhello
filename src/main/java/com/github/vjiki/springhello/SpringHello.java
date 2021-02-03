package com.github.vjiki.springhello;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHello {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        PersonBean person = context.getBean("iam", PersonBean.class);

        System.out.println(person.getName() + " " + person.getAge());

        context.close();
    }
}
