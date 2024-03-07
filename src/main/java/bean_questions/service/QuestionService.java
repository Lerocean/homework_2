package bean_questions.service;

import bean_questions.model.Question;

import java.util.List;

public interface QuestionService {
    void askQuestions();

    List<Question> getQuestions();

    String getCorrectAnswer(Question question);
}