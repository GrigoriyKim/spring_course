package AspectOrientedProgramming.Pointcut1.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    /* sootvetstvuet metodu bez parametrov, iz klassa UnivercityLibrary s
    access modifier = public,
    return type = void i imenem = getBook */
    @Before("execution(public void getBook())")
//    @Before("execution(public void get*())")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: popitka poluchit knigu");
    }
    @Before("execution(public void returnBook())")
    public void beforeReturnBookAdvice() {
        System.out.println("beforeGetBookAdvice: popitka vernut knigu");
    }
    @Before("execution(public void getMagazine())")
    public void beforeGetMagazineAdvice() {
        System.out.println("beforeGetMagazineAdvice: popitka poluchit jurnal");
    }
}
