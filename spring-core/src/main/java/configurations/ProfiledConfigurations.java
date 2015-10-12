package configurations;

import org.springframework.context.annotation.*;
import profile.SimpleString;

/**
 * Created by krishan on 8/16/15.
 */
@Configuration
@ComponentScan("profile")
@ImportResource("classpath:profile-application-context.xml") // no space after or before colon
public class ProfiledConfigurations {
    @Bean
    @Profile("prod")
    SimpleString prodSimpleString(){
        return new SimpleString("prod simple string");
    }
}
