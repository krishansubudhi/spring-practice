package travel;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by krishan on 9/7/15.
 */
public class TravelCondition implements Condition {

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        if( conditionContext.getBeanFactory().getBeansOfType(Car.class).isEmpty() ) {
            System.out.println("No Car bean found.");
            return false;
        }
        return true;
    }
}
