package bean_questions.service;

import bean_questions.model.Question;
import java.util.List;

public interface QuestionService {
    void sayHello(String name);

    void sayGoodbye(String name);

    void sayPassword(String password);

    void sayAge(String riddle);

    void sayYear(int year);

    void askQuestions();

    List<Question> getQuestions();

    String getCorrectAnswer(Question question);
}
