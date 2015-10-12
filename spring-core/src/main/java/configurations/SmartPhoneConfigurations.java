package configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import phone.SmartPhone;
import phone.body.Screen;
import phone.semiconductors.Ram;

/**
 * Created by krishan on 8/13/15.
 */
@Configuration
public class SmartPhoneConfigurations {
    @Bean
    public SmartPhone galaxyS4(){
        return new SmartPhone(threeGBRam(),phabletScreenLED());
    }

    @Bean
    public SmartPhone oneplus(){
        return new SmartPhone(threeGBRam(),phabletScreenLCD());
    }


    @Bean
    public Ram threeGBRam(){
        return new Ram(3);
    }

    @Bean
    public Ram fourGBRam(){
        return new Ram(4);
    }

    @Bean
    public Screen phabletScreenLED(){
        return new Screen(5.1f, Screen.Type.LED);
    }

    private Screen phabletScreenLCD() {
        return new Screen(5.1f, Screen.Type.LCD);
    }
}
