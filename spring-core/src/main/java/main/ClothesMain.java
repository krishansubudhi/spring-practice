package main;

import annotations.Chapter;
import clothes.Wardobe;
import configurations.ClothesConfigurations;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by krishan on 9/7/15.
 */
@Chapter(id=5, tags = "Qualifiers")
public class ClothesMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext
                = new AnnotationConfigApplicationContext(ClothesConfigurations.class);
        Wardobe wardobe = annotationConfigApplicationContext.getBean(Wardobe.class);
        System.out.println("Wardobe = " + wardobe);
    }
}
