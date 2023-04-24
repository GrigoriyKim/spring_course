package com.gkim.spring.spring_introduction.LoC_DI;

//@Component("catBean")
public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
