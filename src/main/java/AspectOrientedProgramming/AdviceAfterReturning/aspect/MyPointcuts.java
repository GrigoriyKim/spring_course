package AspectOrientedProgramming.AdviceAfterReturning.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {
    @Pointcut("execution(* abc*(..))")
    public void allAddMethods(){}
}