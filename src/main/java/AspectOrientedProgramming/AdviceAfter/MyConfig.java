package AspectOrientedProgramming.AdviceAfter;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("AspectOrientedProgramming.AdviceAfter")
@EnableAspectJAutoProxy
public class MyConfig {

}
