package AspectOrientedProgramming.AdviceAfterThrowing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Prestuplenie i nakazanie")
    private String name;
    @Value("F.M.Dostoevskiy")
    private String author;
    @Value("1866")
    private int yearOfPublication;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
}
