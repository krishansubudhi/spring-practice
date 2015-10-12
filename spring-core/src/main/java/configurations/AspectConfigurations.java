package configurations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by krishan on 9/28/15.
 */
@EnableAspectJAutoProxy
@ComponentScan("aspect")
@ImportResource("classpath:aspect/doordarshan-integration-context.xml")
public class AspectConfigurations {
}
