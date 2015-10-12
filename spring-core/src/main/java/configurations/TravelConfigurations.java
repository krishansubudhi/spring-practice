package configurations;

import org.springframework.context.annotation.Bean;
import travel.Car;
import travel.Trip;

/**
 * Created by krishan on 9/7/15.
 */
// Trip bean is being created first . TravelCondition failing as Car is not created yet. Hence trip bean creation fails.
//@ComponentScan("travel")
public class TravelConfigurations {
    @Bean
    public Car car(){
        return new Car();
    }

    //Car is created now. hence trip bean gets created too.
    @Bean
    public Trip trip(){
        return new Trip();
    }
}
