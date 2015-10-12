package clothes;

import clothes.qualifiers.TopWear;
import clothes.qualifiers.Women;
import org.springframework.stereotype.Component;

/**
 * Created by krishan on 9/7/15.
 */

@Women
@TopWear
@Component
public class WomenTop implements Cloth {
}
