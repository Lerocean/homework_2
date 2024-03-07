package bean_questions.service;

import bean_questions.model.Question;

import java.util.List;

public interface QuestionService {
    void sayGoodbye(String name);

    void askQuestions();
    void sayHello(String name);


    List<Question> getQuestions();

    String getCorrectAnswer(Question question);
}