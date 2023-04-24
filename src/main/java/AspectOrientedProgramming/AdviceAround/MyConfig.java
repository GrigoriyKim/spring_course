package AspectOrientedProgramming.AdviceAround;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("AspectOrientedProgramming.AdviceAround")
@EnableAspectJAutoProxy
public class MyConfig {

}
