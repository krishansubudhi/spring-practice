package main;

import annotations.Chapter;
import configurations.ProfiledConfigurations;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import profile.SimpleString;

import java.util.Map;

/**
 * Created by krishan on 8/16/15.
 */

@Chapter(id = 3, tags = {"profile"})
/*Change config in edit configuration of ProfileMain in run tab

-Dspring.profiles.default=dev -Dspring.profiles.active=prod

Profile can be set useing:
As initialization parameters on DispatcherServlet
As context parameters of a web application
As JNDI entries
As environment variables
As JVM system properies
Using the @ActiveProfiles annotation on an integration test class

 */

public class ProfileMain {
    public static void main(String [] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext
                = new AnnotationConfigApplicationContext(ProfiledConfigurations.class);
        Map<String,SimpleString> simpleStringMap= annotationConfigApplicationContext.getBeansOfType(SimpleString.class);
        System.out.println(simpleStringMap);
    }
}
