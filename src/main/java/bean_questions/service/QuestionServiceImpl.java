package bean_questions.service;

import bean_questions.model.Question;
import bean_questions.dao.QuestionDao;
import java.util.List;
import java.util.Scanner;

public class QuestionServiceImpl implements QuestionService {

    private final QuestionDao questionDao;

    public QuestionServiceImpl(QuestionDao questionDao) {
        this.questionDao = questionDao;
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
}