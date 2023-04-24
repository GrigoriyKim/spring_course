package AspectOrientedProgramming.AdviceAfterReturning.aspect;

import AspectOrientedProgramming.AdviceAfterReturning.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {
    @Before("AspectOrientedProgramming.AdviceAfterReturning.aspect.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());

        if (methodSignature.getName().equals("addBook")){
            Object[] arguments = joinPoint.getArgs();
            for (Object obj : arguments){
                if (obj instanceof Book){
                    Book myBook = (Book) obj;
                    System.out.println("Information of book: title - " + myBook.getName() +
                            ", author - " + myBook.getAuthor() +
                            ", year of publication - " + myBook.getYearOfPublication());
                } else if (obj instanceof String) {
                    System.out.println("adds a book to the library " + obj);
                }
            }
        }
        System.out.println("beforeGetLoggingAdvice: logirovanie popitki poluchit knigu/jurnal");
        System.out.println("-------------------------------------------");
    }


}
