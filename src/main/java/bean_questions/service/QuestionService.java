package bean_questions.service;

import bean_questions.model.Question;

import java.util.List;

public interface QuestionService {
    void sayGoodbye(String name);

    void askQuestions();
    void sayHello(String name);

    void sayPassword(String name);
    void sayAge(String name);

    void sayYear(int year);

    List<Question> getQuestions();

    String getCorrectAnswer(Question question);
}