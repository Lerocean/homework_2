package bean_questions.service;

import bean_questions.aspect.annotation.LoggingMethod;
import bean_questions.dao.QuestionDao;
import bean_questions.model.Question;
import java.util.List;
import java.util.Scanner;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImpl implements QuestionService {

    private final QuestionDao questionDao;

    public QuestionServiceImpl(QuestionDao questionDao) {
        this.questionDao = questionDao;
    }

    @Override
    @LoggingMethod
    public void sayHello(String name) {
        System.out.println("Привет " + name);
    }

    @LoggingMethod
    @Override
    public void sayGoodbye(String name) {
        System.out.println("Пока " + name);
    }

    @LoggingMethod
    @Override
    public void sayPassword(String password) {
        System.out.println("Пароль " + password);
    }

    @LoggingMethod
    @Override
    public void sayAge(String riddle) {
        System.out.println("Возраст " + riddle);
    }

    @LoggingMethod
    @Override
    public void sayYear(int year) {
        System.out.println("Год рождения " + year);
    }

    @Override
    public void sayGreeting(String name) {

    }

    @Override
    public void sayFarewell(String name) {

    }

    @Override
    public void askQuestions() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите фамилию и имя: ");
        String name = scanner.nextLine();

        if (name.isEmpty()) {
            System.out.println("Вы не ввели ответ. Пожалуйста, попробуйте снова.");
            System.exit(0);
        }
        List<Question> questions = questionDao.loadQuestions();
        int score = 0;
        int questionCount = 0;
        int maxQuestions = 5;

        for (Question question : questions) {
            if (questionCount >= maxQuestions) {
                break;
            }

            System.out.print(question.getQuestion() + ": ");
            String answer = scanner.nextLine();
            String correctAnswer = question.getAnswer();

            if (answer.equalsIgnoreCase(correctAnswer)) {
                score++;
            }
            questionCount++;
        }

        System.out.println("Результат тестирования для " + name + ":");
        System.out.println("Правильных ответов: " + score);
        System.out.println("Неправильных ответов: " + (questionCount - score));
    }

    @Override
    public List<Question> getQuestions() {
        return null;
    }

    @Override
    public String getCorrectAnswer(Question question) {
        return null;
    }
}