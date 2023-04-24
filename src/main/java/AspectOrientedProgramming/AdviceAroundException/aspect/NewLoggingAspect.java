package AspectOrientedProgramming.AdviceAroundException.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: v biblioteku pitayutsya vernut knigu");
        Object targetMethodResult = null;
        try {
//        long begin = System.currentTimeMillis();
            targetMethodResult = proceedingJoinPoint.proceed();
//        targetMethodResult = "prestuplenie i nakazanie";
//        long end = System.currentTimeMillis();
        } catch (ArithmeticException ae) {
            System.out.println("aroundReturnBookLoggingAdvice: bilo poymano isklyuchenie " + ae);
            throw ae;
        }

        System.out.println("aroundReturnBookLoggingAdvice: v biblioteku vozvrashaet knigu");
//        System.out.println("aroundReturnBookLoggingAdvice: method returnBook vipolnil rabotu za "
//        + (end-begin) + " millisekund");
        return targetMethodResult;
    }
}
