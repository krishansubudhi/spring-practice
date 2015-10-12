package travel;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Service;

/**
 * Created by krishan on 9/7/15.
 */
@Conditional(TravelCondition.class)
@Service
public class Trip {
    public Trip() {
        System.out.println("Trip bean created");
    }
}
