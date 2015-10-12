package main;

import annotations.Chapter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import travel.Car;

import java.util.Map;

/**
 * Created by krishan on 9/7/15.
 */
@Chapter(id=4,tags = "Conditional")
public class TravelMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext
                = new AnnotationConfigApplicationContext(configurations.TravelConfigurations.class);
        Map<String, Car> carBeans = annotationConfigApplicationContext.getBeansOfType(Car.class);
        System.out.println("Car Beans: " + carBeans);
    }
}
