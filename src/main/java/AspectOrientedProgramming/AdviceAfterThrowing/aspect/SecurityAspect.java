package AspectOrientedProgramming.AdviceAfterThrowing.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(20)
public class SecurityAspect {
    @Before("AspectOrientedProgramming.AdviceAfterThrowing.aspect.MyPointcuts.allAddMethods()")
    public void beforeAddSecurityAdvice(){
        System.out.println("beforeGetSecurityAdvise: proverka prav na poluchenie knigi/jurnala");
        System.out.println("-------------------------------------------");
    }
}
