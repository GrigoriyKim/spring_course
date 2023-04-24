package AspectOrientedProgramming.AdviceAround.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        long begin = System.currentTimeMillis();
        Object targetMethodResult = proceedingJoinPoint.proceed();
        targetMethodResult = "prestuplenie i nakazanie";
        long end = System.currentTimeMillis();

        System.out.println("aroundReturnBookLoggingAdvice: v biblioteku vozvrashaet knigu");
        System.out.println("aroundReturnBookLoggingAdvice: method returnBook vipolnil rabotu za "
        + (end-begin) + " millisekund");
        return targetMethodResult;
    }
}
