package bean_questions.aspect;

import bean_questions.aspect.annotation.*;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("@annotation(loggingMethod)")

    public void logBefore(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Вызван метод " + methodName);
    }

    @Around(value = "@annotation(loggingMethod)", argNames = "joinPoint, loggingMethod")
    public Object logAround(ProceedingJoinPoint joinPoint, LoggingMethod loggingMethod) throws Throwable {
        System.out.println("Работает Around");
        return joinPoint.proceed();
    }


    @After("isLogPointcut()")
    public void logAfter(JoinPoint joinPoint) {
        String afterMethod = joinPoint.getSignature().getName();
        System.out.println("Вызван метод after " + afterMethod);
    }

    @Pointcut("execution(* bean_questions.service.QuestionServiceImpl.*(..))")
    public void isLogPointcut() {
    }


    @Before("@annotation(myBefore)")
    public void myBeforeAdvice(JoinPoint joinPoint, MyBefore myBefore) {
        System.out.println("Вызов метода с аннотацией @MyBefore: " + joinPoint.getSignature().getName());
    }

    // Метод для аннотации @MyAfter
    @After("@annotation(myAfter)")
    public void myAfterAdvice(JoinPoint joinPoint, MyAfter myAfter) {
        System.out.println("Метод выполнен с аннотацией @MyAfter: " + joinPoint.getSignature().getName());
    }

    @Around("@annotation(myAround)")
    public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint, MyAround myAround) throws Throwable {
        System.out.println("Выполнение метода с аннотацией @MyAround: " + proceedingJoinPoint.getSignature().getName());
        Object result = proceedingJoinPoint.proceed();
        System.out.println("Метод выполнен с аннотацией @MyAround: " + proceedingJoinPoint.getSignature().getName());
        return result;
    }

    @Pointcut("@annotation(myPointcut)")
    public void myPointcutMethod(MyPointcut myPointcut) {
    }
}