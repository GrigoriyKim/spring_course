package AspectOrientedProgramming.Pointcut1;


import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary{
    @Override
    public void getBook() {
        System.out.println("Mi berem knigu iz SchoolLibrary");
    }
}
