package AspectOrientedProgramming.AdviceBefore;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library {
    public void getBook() {
        System.out.println("Mi berem knigu");
    }
}
