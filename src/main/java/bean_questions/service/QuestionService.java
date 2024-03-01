package bean_questions.service;

import bean_questions.dao.Question;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface QuestionService {
    List<Question> getQuestions();

    String getCorrectAnswer(Question question);
}