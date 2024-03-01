package bean_questions;

import bean_questions.config.AppConfig;
import bean_questions.dao.QuestionDao;
import bean_questions.service.QuestionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        QuestionService questionService = context.getBean(QuestionService.class);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите фамилию и имя: ");
        String name = scanner.nextLine();

        List<QuestionDao> questionDaos = questionService.getQuestions();
        int score = 0;
        int questionCount = 0;
        int maxQuestions = 5;

        for (QuestionDao questionDao : questionDaos) {
            if (questionCount >= maxQuestions)
                break;

            System.out.print(questionDao.getQuestion() + ": ");
            String answer = scanner.nextLine();
            String correctAnswer = questionService.getCorrectAnswer(questionDao);

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
