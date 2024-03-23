package bean_questions;

import bean_questions.service.AnotherService;
import bean_questions.service.QuestionService;
import bean_questions.service.QuestionServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@ComponentScan
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        QuestionService questionService = context.getBean(QuestionServiceImpl.class);
        //questionService.sayHello("Саша");
        //questionService.sayGoodbye("Саша");
        //questionService.sayPassword("12345");
        //questionService.sayAge("На 2 больше, чем 18");
        //questionService.sayYear(2004);


        AnotherService anotherService = context.getBean(AnotherService.class);
        anotherService.sayGreeting();
        anotherService.sayFarewell();
    }
}