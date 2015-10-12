package aspect.media;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by krishan on 9/28/15.
 */
@Aspect
@Component
public class SomeNewsChannel {

    @Pointcut("execution(* aspect.election.*.finalizeDates(..))")
    public void dateDeclaration(){};

    @Pointcut("execution(* aspect.election.*.poll(..))")
    public void pollTime(){};

    @Pointcut("execution(* aspect.election.*.result(int))" +
            "&& args(constit)")
    public void result(int constit) {}


    @After("dateDeclaration()")
    public void createHype(){
        System.out.println("News Channels: Hype Hype Hype Hype !");
    }

    @Before("pollTime()")
    public void opinionPoll(){
        System.out.println("News Channels: Opinion Poll ..");
    }

    @After("pollTime()")
    public void exitPoll(){
        System.out.println("News Channels: Exit poll !!");
    }

    @After("result(constit)")
    public void flashResult(int constit){
        System.out.println("Result is out of constituency : " + constit);
    }

    @Around("pollTime()")
    public void aroundPoll(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("News Channels: Gather near poll booths.");
        try {
            proceedingJoinPoint.proceed();

        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("News Channels: Booth capturing. Cancelling election");
        }
        System.out.println("News Channels: Interview voters.");

    }
}
