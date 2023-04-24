package AspectOrientedProgramming.PointcutCombination.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect2 {
    @Pointcut("execution(* AspectOrientedProgramming.PointcutCombination.UniLibrary.*(..))")
    private void allMethodsFromUniLibrary(){}
    @Pointcut("execution(public void AspectOrientedProgramming.PointcutCombination.UniLibrary.returnMagazine())")
    private void returnMagazineFromUniLibrary(){}

    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
    private void allMethodsExceptReturnMagazineFromUniLibrary(){}

    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
    public void beforeAllMethodsExceptReturnMagazineAdvice(){
        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: writing Log #10");
    }

}
