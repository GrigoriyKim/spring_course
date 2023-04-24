package AspectOrientedProgramming.orderOfExecutionOfAspects.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {
    @Before("AspectOrientedProgramming.orderOfExecutionOfAspects.aspect.MyPointcuts.allGetMethods()")
    public void beforeGetLoggingAdvice(){
        System.out.println("beforeGetLoggingAdvice: logirovanie popitki poluchit knigu/jurnal");
    }


}
