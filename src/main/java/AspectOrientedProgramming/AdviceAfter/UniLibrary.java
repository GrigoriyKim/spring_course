package AspectOrientedProgramming.AdviceAfter;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    public void getBook() {
        System.out.println("Mi berem knigu iz UniLibrary");
        System.out.println("-------------------------------------------");
    }
    public void returnBook(){
        System.out.println("Mi vozvrashaem knigu v UniLibrary");
        System.out.println("-------------------------------------------");
    }
    public void getMagazine() {
        System.out.println("Mi berem jurnal iz UniLibrary");
        System.out.println("-------------------------------------------");
    }
    public void returnMagazine() {
        System.out.println("Mi vozvrashaem jurnal v UniLibrary");
        System.out.println("-------------------------------------------");
    }
    public void addBook(String person_name, Book book){
        System.out.println("Mi dobavlyaem knigu v UniLibrary");
        System.out.println("-------------------------------------------");
    }
    public void addMagazine(){
        System.out.println("Mi dobavlyaem jurnal v UniLibrary");
        System.out.println("-------------------------------------------");
    }
}
