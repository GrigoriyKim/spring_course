package AspectOrientedProgramming.AdviceBefore.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    /* Sootvetstvuet metodu bez parametrov, gde bi on ni naxodilsya s
    access modifier = public,
    return type = void i imenem getBook */
    @Before("execution(public void getBook())")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: popitka poluchit knigu");
    }
}
