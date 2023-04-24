package AspectOrientedProgramming.AdviceAround;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("Method main starts");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary library = context.getBean("uniLibrary", UniLibrary.class);
        String bookName = library.returnBook();
        System.out.println("V biblioteku vernuli knigu " + bookName);


        context.close();
        System.out.println("Method main ends");
    }
}
