package com.gkim.spring.spring_introduction.LoC_DI;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Person person = context.getBean("personBean", Person.class);
//        person.callYourPet();
//        Pet cat1= context.getBean("catBean", Pet.class);
//        Pet cat2 = context.getBean("catBean", Pet.class);
//        cat.say();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close();
    }
}
