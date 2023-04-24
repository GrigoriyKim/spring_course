package AspectOrientedProgramming.AdviceAfterReturning;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("AspectOrientedProgramming.AdviceAfterReturning")
@EnableAspectJAutoProxy
public class MyConfig {

}
