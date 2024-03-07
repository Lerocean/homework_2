package bean_questions;

import bean_questions.config.AppConfig;
import bean_questions.model.Question;
import bean_questions.service.QuestionService;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.List;
import java.util.Scanner;
@Aspect
@EnableAspectJAutoProxy
@ComponentScan
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        QuestionService questionService = context.getBean(QuestionService.class);
        questionService.askQuestions();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = scanner.nextLine();

        List<Question> questions = questionService.getQuestions();
        int score = 0;
        int questionCount = 0;
        int maxQuestions = 5;

        for (Question question : questions) {
            if (questionCount >= maxQuestions)
                break;

            System.out.print(question.getQuestion() + ": ");
            String answer = scanner.nextLine();
            String correctAnswer = questionService.getCorrectAnswer(question);

            if (answer.equalsIgnoreCase(correctAnswer)) {
                score++;
            }
            questionCount++;
        }

        System.out.println("Результат тестирования для " + name + ":");
        System.out.println("Правильных ответов: " + score);
        System.out.println("Неправильных ответов: " + (maxQuestions - score));

        scanner.close();
    }
}