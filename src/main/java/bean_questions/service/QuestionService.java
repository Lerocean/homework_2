package bean_questions.service;

import bean_questions.dao.QuestionDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface QuestionService {
    List<QuestionDao> getQuestions();
    String getCorrectAnswer(QuestionDao questionDao);

}