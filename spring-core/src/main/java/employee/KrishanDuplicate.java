package employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * Created by krishan on 9/8/15.
 */

@Component
public class KrishanDuplicate extends Employee {

    //Autowired is required for constructor injection.

    @Autowired
    Environment environment;

    @Autowired
    /*public KrishanDuplicate(@Value("#{environment['name']}") String name,
                            @Value("#{environment['age']}") Integer age,
                            @Value("#{environment['company']}") String company) {*/

    public KrishanDuplicate(@Value("#{systemProperties['name']}") String name,
                            @Value("#{1}") Integer age,
                            @Value("#{'hello'}") String company) {
        super(name, age, company);
    }
}
