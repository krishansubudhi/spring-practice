package aspect.election;

/**
 * Created by krishan on 9/28/15.
 */
public interface Election {
    public void finalizeDates();
    public void poll();
    public void result(int constituency_code);
}
