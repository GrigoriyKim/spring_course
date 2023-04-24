package AspectOrientedProgramming.orderOfExecutionOfAspects.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class ExceptionHandlingAspect {
    @Before("AspectOrientedProgramming.orderOfExecutionOfAspects.aspect.MyPointcuts.allGetMethods()")
    public void beforeGetExceptionHandlingAdvice(){
        System.out.println("beforeGetExceptionHandlingAdvice: lovim/obrabativetm" +
                " isklyucheniya pri popitke poluchit knigu/jurnal");
    }
}
