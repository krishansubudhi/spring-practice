package main;

import annotations.Chapter;
import cinema.Multiplex;
import cinema.Theatre;
import configurations.CinemaConfigurations;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

/**
 * Created by krishan on 8/14/15.
 */
@Chapter(id=2,tags = { "Dependency Injection", "Auto wiring", "component scan", "import config", "xml list reference"})
public class CinemaMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(CinemaConfigurations.class);

        //This will not detact "CinemaCOnfigurations" as @Configurations annotation is not present in that class.
        /*AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext("config");*/

        Map<String, Theatre> theatre = annotationConfigApplicationContext.getBeansOfType(Theatre.class);

        theatre.entrySet().stream().forEach((entryset) -> {
            System.out.println("Came to theatre : " + entryset.getKey());
            entryset.getValue().start();
        });

        System.out.println("\n\n************** ************");
        System.out.println("Came to multiplexes");
        Map<String, Multiplex> multiplex = annotationConfigApplicationContext.getBeansOfType(Multiplex.class);
        multiplex.entrySet().stream().forEach((entryset) -> {
            System.out.println("Came to multiplex : " + entryset.getKey());
            entryset.getValue().playAll();
        });

        /*System.out.println("\n\n************** ************");
        System.out.println("Came to old multiplexes");
        ClassPathXmlApplicationContext classPathXmlApplicationContext=
                new ClassPathXmlApplicationContext("cinema-application-context.xml");
        Multiplex multiplex_old = classPathXmlApplicationContext.getBean(Multiplex.class);
        multiplex_old.playAll();*/



    }
}
