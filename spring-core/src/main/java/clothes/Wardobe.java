package clothes;

import clothes.qualifiers.BottomWear;
import clothes.qualifiers.Men;
import clothes.qualifiers.TopWear;
import clothes.qualifiers.Women;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by krishan on 9/7/15.
 */

@Component
public class Wardobe {

    @Autowired
    @Qualifier("mentshirt")
    Cloth oneMansTopwear;

    //Below will be same object as above. But looks clean
    @Autowired
    @Men
    @TopWear
    Cloth anotherMansTopwear;

    //NoUniqueBeanDefinitionException
    /*@Autowired
    @Qualifier("jeans")
    Cloth jeans;*/

    @Autowired
    @Women
    @TopWear
    Cloth oneFemaleTopwear;

    @Autowired
    @Men
    @BottomWear
    Cloth oneMansBottomWear;

    @Women
    @BottomWear
    @Autowired
    Cloth oneFemaleBottomWear;

    @Override
    public String toString() {
        return "Wardobe{" +
                "oneMansTopwear=" + oneMansTopwear +
                ", anotherMansTopwear=" + anotherMansTopwear +
                ", oneFemaleTopwear=" + oneFemaleTopwear +
                ", oneMansBottomWear=" + oneMansBottomWear +
                ", oneFemaleBottomWear=" + oneFemaleBottomWear +
                '}';
    }
}
