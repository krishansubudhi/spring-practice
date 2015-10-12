package employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by krishan on 9/8/15.
 */
@Component
public class Krishan extends Employee {

    //Autowired is required for constructor injection.
    @Autowired
    public Krishan( @Value("${name}") String name,
                    @Value("${age}") String age,
                    @Value("${company}") String company) {

        super(name, Integer.parseInt(age), company);
    }
}
