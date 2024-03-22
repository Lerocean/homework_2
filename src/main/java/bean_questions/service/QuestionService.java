package bean_questions.service;

import bean_questions.aspect.annotation.LoggingMethod;
import bean_questions.model.Question;

import java.util.List;

public interface QuestionService {

    @LoggingMethod
    void sayHello(String name);

    @LoggingMethod
    void sayGoodbye(String name);

    @LoggingMethod
    void sayPassword(String password);

    @LoggingMethod
    void sayAge(String riddle);

    @LoggingMethod
    void sayYear(int year);

    @LoggingMethod
    void sayGreeting(String name);

    @LoggingMethod
    void sayFarewell(String name);

    void askQuestions();

    List<Question> getQuestions();

    String getCorrectAnswer(Question question);
}
