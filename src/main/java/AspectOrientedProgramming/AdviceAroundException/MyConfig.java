package AspectOrientedProgramming.AdviceAroundException;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("AspectOrientedProgramming.AdviceAroundException")
@EnableAspectJAutoProxy
public class MyConfig {

}
