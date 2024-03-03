package bean_questions;

import bean_questions.config.AppConfig;
import bean_questions.service.QuestionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        QuestionService questionService = context.getBean(QuestionService.class);
        questionService.askQuestions();
    }
}
