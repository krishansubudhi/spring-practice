package main;

import annotations.Chapter;
import aspect.election.Election;
import configurations.AspectConfigurations;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;
import java.util.Random;

/**
 * Created by krishan on 9/28/15.
 */
@Chapter(id=6, tags = "Aspects")
public class AspectMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext
                = new AnnotationConfigApplicationContext(AspectConfigurations.class);


        ClassPathXmlApplicationContext classPathXmlApplicationContext
                = new ClassPathXmlApplicationContext("aspect-application-context.xml");

        System.out.println("\n\nProcessing annotaion application contexts " );
        processAspectBeans(annotationConfigApplicationContext);

        System.out.println("\n\nProcessing classpath xml application contexts " );
        processAspectBeans(classPathXmlApplicationContext);

    }

    private static void processAspectBeans(ApplicationContext annotationConfigApplicationContext) {
        Map<String, Election> annotBeans = annotationConfigApplicationContext.getBeansOfType(Election.class);
        annotBeans.entrySet().stream().forEach((entryset) -> {
            System.out.println("Starting election process for " + entryset.getKey());
            Election election = entryset.getValue();
            election.finalizeDates();
            election.poll();
            election.result(new Random().nextInt(100));
        });
    }
}
