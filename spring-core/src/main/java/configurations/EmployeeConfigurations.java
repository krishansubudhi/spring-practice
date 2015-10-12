package configurations;

import employee.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * Created by krishan on 9/8/15.
 */


@ComponentScan("employee")
@PropertySource("classpath:employees/krishan.txt")
public class EmployeeConfigurations {
    @Autowired
    Environment environment;
    @Bean
    Employee ram (){
        System.out.println("Environment = " + environment.getClass().getName());
        return new Employee(
            environment.getProperty("name"),
                environment.getProperty("age", Integer.class),
                environment.getProperty("company")
        );
    }


    /*In order to use placeholder values, you must configure either a PropertyPlaceholder-
Configurer bean or a PropertySourcesPlaceholderConfigurer bean. Starting with
Spring 3.1, PropertySourcesPlaceholderConfigurer is preferred because it resolves
placeholders against the Spring Environment and its set of property sources.
*/

    //If porpertysourcePlaceHol ..  bean is not defined , @Value annotation will not work properly.
    @Bean
    public
    static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
