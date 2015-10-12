package phone.others;

/**
 * Created by krishan on 8/13/15.
 */
public class Battery {
    int milliAmpereHour;

    public Battery(int milliAmpereHour) {
        this.milliAmpereHour = milliAmpereHour;
    }

    @Override
    public String toString() {
        return "Battery{" +
                "milliAmpereHour=" + milliAmpereHour +
                '}';
    }
}
