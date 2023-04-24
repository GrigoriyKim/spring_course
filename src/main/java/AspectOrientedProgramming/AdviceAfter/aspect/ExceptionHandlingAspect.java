package AspectOrientedProgramming.AdviceAfter.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class ExceptionHandlingAspect {
    @Before("AspectOrientedProgramming.AdviceAfter.aspect.MyPointcuts.allAddMethods()")
    public void beforeAddExceptionHandlingAdvice(){
        System.out.println("beforeGetExceptionHandlingAdvice: lovim/obrabativetm" +
                " isklyucheniya pri popitke poluchit knigu/jurnal");
        System.out.println("-------------------------------------------");
    }
}
