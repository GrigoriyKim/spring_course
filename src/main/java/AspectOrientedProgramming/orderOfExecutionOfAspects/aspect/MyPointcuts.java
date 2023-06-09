package AspectOrientedProgramming.orderOfExecutionOfAspects.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {
    @Pointcut("execution(* get*())")
    public void allGetMethods(){}
}
