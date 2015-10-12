package configurations;

import cinema.BajrangiBhaijaan;
import cinema.Multiplex;
import cinema.Theatre;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by krishan on 8/14/15.
 */

//Try this too. More safe. Scans components in provided class's package
//@ComponentScan(basePackageClasses = {Cinema.class})

//Using the below line only scans components in the current package
//@ComponentScan

//@Configuration
@ComponentScan("cinema")
@ImportResource("classpath:cinema-application-context.xml")
public class CinemaConfigurations {
    @Bean
    public BajrangiBhaijaan bajrangiBhaijaan(){
        return new BajrangiBhaijaan();
    }

    @Bean
    public Multiplex multiplex(){
        return new Multiplex();
    }

    /*Bean is passed automatically*/
    @Bean
    public Theatre anotherTheatre(BajrangiBhaijaan cinema){
        return new Theatre(cinema);
    }
}
