package AspectOrientedProgramming.Pointcut2;


import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary {
    public void getBook() {
        System.out.println("Mi berem knigu iz SchoolLibrary");
    }
}