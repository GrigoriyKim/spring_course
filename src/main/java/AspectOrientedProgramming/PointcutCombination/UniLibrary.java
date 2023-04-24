package AspectOrientedProgramming.PointcutCombination;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    public void getBook() {
        System.out.println("Mi berem knigu iz UniLibrary");
    }
    public void returnBook(){
        System.out.println("Mi vozvrashaem knigu v UniLibrary");
    }
    public void getMagazine() {
        System.out.println("Mi berem jurnal iz UniLibrary");
    }
    public void returnMagazine() {
        System.out.println("Mi vozvrashaem jurnal v UniLibrary");
    }
    public void addBook(){
        System.out.println("Mi dobavlyaem knigu v UniLibrary");
    }
    public void addMagazine(){
        System.out.println("Mi dobavlyaem jurnal v UniLibrary");
    }
}
