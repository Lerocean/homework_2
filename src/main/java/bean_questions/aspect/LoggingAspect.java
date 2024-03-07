package bean_questions.aspect;

import bean_questions.aspect.annotation.LoggingMethod;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
   //@Before("execution(* bean_questions.service.QuestionServiceImpl.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Вызван метод " + methodName);
    }
    @Around(value = "@annotation(loggingMethod)", argNames = "joinPoint, loggingMethod")
    public Object logAround(ProceedingJoinPoint joinPoint, LoggingMethod loggingMethod) throws Throwable {
        System.out.println("Работает Around");
        return joinPoint.proceed();
    }
}
