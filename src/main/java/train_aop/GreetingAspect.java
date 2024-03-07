package train_aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GreetingAspect{

    @Pointcut("execution(* Main.printName(String))")
    public void greeting() {
    }

    @Before("greeting()")
    public void beforeAdvice() {
        System.out.print("Привет ");
    }
}
