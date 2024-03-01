package bean_questions;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface QuestionService {
    List<Question> getQuestions();
    String getCorrectAnswer(Question question);

}