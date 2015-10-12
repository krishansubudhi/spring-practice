package clothes;

import clothes.qualifiers.Men;
import clothes.qualifiers.TopWear;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by krishan on 9/7/15.
 */
@Qualifier("mentshirt")
@Men
@TopWear
@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)// This will create different beans everythime it it fetched/autowired.
public class MenTshirt implements Cloth{
}
