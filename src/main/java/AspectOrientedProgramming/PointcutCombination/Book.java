package AspectOrientedProgramming.PointcutCombination;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Prestuplenie i nakazanie")
    private String name;

    public String getName() {
        return name;
    }
}
