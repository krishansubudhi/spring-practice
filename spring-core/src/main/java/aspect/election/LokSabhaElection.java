package aspect.election;

import org.springframework.stereotype.Component;

/**
 * Created by krishan on 9/28/15.
 */
@Component
public class LokSabhaElection implements Election {
    @Override
    public void finalizeDates() {
        System.out.println("Lok Sabha Election dates finalized");
    }

    @Override
    public void poll() {
        System.out.println("Lok Sabha voting going on");
    }

    @Override
    public void result(int constituency_code) {

    }
}
