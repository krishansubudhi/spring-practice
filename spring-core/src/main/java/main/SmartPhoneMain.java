package main;

import annotations.Chapter;
import configurations.SmartPhoneConfigurations;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import phone.SmartPhone;
import phone.body.Screen;
import phone.semiconductors.Ram;

/**
 * Created by krishan on 8/13/15.
 */
@Chapter(id=1,tags = {"Basic", "Dependency Injection", "Bean Creation", "Application Context", "xml application context", "import xml config"})
public class SmartPhoneMain {
    public static void main(String [] args){/*
        System.out.println("\n\n************** ************");
        System.out.println("Tranditional Object");
        System.out.println(traditionalObject());

*/
        executeXML();

        executeConfigFile();

    }

    private static void executeConfigFile() {
        System.out.println("\n\n************** ************");
        System.out.println("Spring Object from configuration file");
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(SmartPhoneConfigurations.class);
        /*annotationConfigApplicationContext.scan();
        annotationConfigApplicationContext.refresh(); //Donno why its needed*/
        System.out.println(annotationConfigApplicationContext.getBeansOfType(SmartPhone.class));
    }

    private static void executeXML() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("smartphone-application-context.xml");
        System.out.println("\n\n************** ************");
        System.out.println("Spring Object from xml");
        System.out.println(classPathXmlApplicationContext.getBeansOfType(SmartPhone.class));
    }

    private static SmartPhone traditionalObject() {
        SmartPhone onePlus = new SmartPhone(
                new Ram(3),
                new Screen(5.5f,Screen.Type.LCD)/*,
                new Battery(2800),
                new Processor("Qualcomm", "Snapdragon 801", 1.7f, 4)*/
        );
        return onePlus;
    }
}
