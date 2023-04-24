package AspectOrientedProgramming.PointcutDeclaration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("AspectOrientedProgramming.PointcutDeclaration")
@EnableAspectJAutoProxy
public class MyConfig {

}
