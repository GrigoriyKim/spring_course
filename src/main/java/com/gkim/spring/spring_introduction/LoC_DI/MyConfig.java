package com.gkim.spring.spring_introduction.LoC_DI;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:myApp.properties")
//@ComponentScan("com.gkim.spring.spring_introduction")
public class MyConfig {
    @Bean
    @Scope("singleton")
    public Pet catBean() {
//        System.out.println("!!!");
        return new Cat();
    }
    @Bean
    public Person personBean() {
        return new Person(catBean());
    }
}
