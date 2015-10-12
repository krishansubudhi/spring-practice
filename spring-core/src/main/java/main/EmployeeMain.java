package main;

import annotations.Chapter;
import configurations.EmployeeConfigurations;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import employee.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * Created by krishan on 9/8/15.
 */
@Chapter(id=6, tags = {"property place holder", "environment", "config file", "spel"})
public class EmployeeMain {


    public static void main(String[] args) {

        System.out.println("******Loading beans through annotation config********");
        AnnotationConfigApplicationContext annotationConfigApplicationContext
                = new AnnotationConfigApplicationContext(EmployeeConfigurations.class);
        Map<String, Employee> beans = annotationConfigApplicationContext.getBeansOfType(Employee.class);
        System.out.println(beans);

        System.out.println("\n\n*************Loading beans through xml ********");
        ClassPathXmlApplicationContext classPathXmlApplicationContext
                = new ClassPathXmlApplicationContext("employee-application-context.xml");
        Map<String, Employee> xmlBeans = classPathXmlApplicationContext.getBeansOfType(Employee.class);
        System.out.println(xmlBeans);

    }
}
