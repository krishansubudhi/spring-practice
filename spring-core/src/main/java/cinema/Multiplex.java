package cinema;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by krishan on 8/15/15.
 */
//@Component
public class Multiplex {

    @Autowired
    List<Cinema> cinemaList;

    public void setCinemaList(List<Cinema> cinemaList) {
        this.cinemaList = cinemaList;
    }

    public void playAll(){
        //Learning some java8 magic
        cinemaList.stream().forEach((cinema) -> {
                    cinema.play();
                }
        );
    }
}
