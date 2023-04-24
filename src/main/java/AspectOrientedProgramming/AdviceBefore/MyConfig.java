package AspectOrientedProgramming.AdviceBefore;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("AspectOrientedProgramming.AdviceBefore")
@EnableAspectJAutoProxy
public class MyConfig {

}
