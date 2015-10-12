package aspect.election;

/**
 * Created by krishan on 9/28/15.
 */
public class AssemblyElection implements Election {
    @Override
    public void finalizeDates() {
        System.out.println("Assembly Election dates finalized");
    }

    @Override
    public void poll() {
        System.out.println("Assembly voting going on");
    }

    @Override
    public void result(int constituency_code) {

    }
}
