package com.gkim.spring.spring_introduction.LoC_DI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Dog myDog = context.getBean("dog", Dog.class);
//        Dog yourDog = context.getBean("dog", Dog.class);
//
//        System.out.println("Peremennie ssilayutsya na odin i tot je object? " +
//                (myDog==yourDog));
//        System.out.println(myDog);
//        System.out.println(yourDog);
        myDog.say();
        context.close();
    }
}
