package profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by krishan on 8/16/15.
 */
@Profile("dev")
@Component
public class SimpleString {

    public SimpleString() {
        setData("default");
    }
    //How to autowire with default values ? if constructor has reference!
    String data;

    public SimpleString(String data) {
        setData(data);
    }

    public void setData(String data) {
        System.out.println("Simple String \"" + data + "\" created");
        this.data = data;
    }
}
