package AspectOrientedProgramming.JoinPointcut;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("AspectOrientedProgramming.JoinPointcut")
@EnableAspectJAutoProxy
public class MyConfig {

}
