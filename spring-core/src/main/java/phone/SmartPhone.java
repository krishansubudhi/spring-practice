package phone;

import phone.body.Screen;
import phone.semiconductors.Ram;

/**
 * Created by krishan on 8/13/15.
 */
public class SmartPhone {
    Ram ram;
    Screen screen;
    /*Battery battery;
    Processor processor;*/

    public SmartPhone(Ram ram, Screen screen/*, Battery battery, Processor processor*/) {
        this.ram = ram;
        this.screen = screen;/*
        this.battery = battery;
        this.processor = processor;*/
        showOff();
    }

    public void showOff(){
        System.out.println("Look at my new Smartphone. " +ram + screen);
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "ram=" + ram +
                ", screen=" + screen +/*
                ", battery=" + battery +
                ", processor=" + processor +*/
                '}';
    }
}
