package clothes;

import clothes.qualifiers.BottomWear;
import clothes.qualifiers.Men;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by krishan on 9/7/15.
 */

@Qualifier("jeans")
@Men
@BottomWear
@Component
public class MenJeans implements Cloth {
}
