package AspectOrientedProgramming.Pointcut2;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    public void getBook(Book book) {
        System.out.println("Mi berem knigu iz UniLibrary " + book.getName());
    }
    public void returnBook(){
        System.out.println("Mi vozvrashaem knigu v UniLibrary");
    }
    public void getMagazine() {
        System.out.println("Mi berem jurnal v UniLibrary");
    }
}
