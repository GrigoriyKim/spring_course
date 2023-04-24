package com.gkim.spring.spring_introduction.LoC_DI;

//@Component
//@Scope("prototype")
// dog
public class Dog implements Pet{
//    private String name;
    public Dog(){
        System.out.println("Dog bean is created");
    }
    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//@PostConstruct
//    public void init(){
//        System.out.println("Class Dog: init method");
//    }
//@PreDestroy
//    public void destroy(){
//        System.out.println("Class Dog: destroy method");
//    }
}
