package clothes;

import clothes.qualifiers.BottomWear;
import clothes.qualifiers.Women;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by krishan on 9/7/15.
 */
@Qualifier("jeans")
@Women
@BottomWear
@Component
public class WomenJeans implements Cloth{
}
