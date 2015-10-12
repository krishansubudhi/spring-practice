package cinema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by krishan on 8/14/15.
 */

@Component
public class Theatre {
    Cinema cinema;

    @Autowired
    public Theatre(Cinema cinema) {
        this.cinema = cinema;
    }

    public void start(){
        cinema.play();
    }
}
