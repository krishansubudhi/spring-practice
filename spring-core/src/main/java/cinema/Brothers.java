package cinema;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by krishan on 8/14/15.
 */

@Component
@Primary
public class Brothers implements Cinema {

    public  static int count = 0;

    public  Brothers(){
        count++;
        System.out.println("Creating Brothers object " + count);
    }

    public void play() {
        System.out.println("Playing Brothers Cinema");
    }
}

