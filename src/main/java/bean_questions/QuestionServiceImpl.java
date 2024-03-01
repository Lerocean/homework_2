package bean_questions;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
@Service
public class QuestionServiceImpl implements QuestionService {
    private List<Question> questions;

    @Override
    public List<Question> getQuestions() {
        if (questions == null) {
            questions = loadQuestions();
        }
        return questions;
    }

    private List<Question> loadQuestions() {
        List<Question> questions = new ArrayList<>();
        String QUESTIONS_FILE = "questions.csv";
        String ANSWERS_FILE = "answers.csv";
        try (InputStream questionsInputStream = new ClassPathResource(QUESTIONS_FILE).getInputStream();
             InputStreamReader questionsReader = new InputStreamReader(questionsInputStream);
             BufferedReader questionsBufferedReader = new BufferedReader(questionsReader);
             InputStream answersInputStream = new ClassPathResource(ANSWERS_FILE).getInputStream();
             InputStreamReader answersReader = new InputStreamReader(answersInputStream);
             BufferedReader answersBufferedReader = new BufferedReader(answersReader)) {

            String questionLine;
            String answerLine;
            while ((questionLine = questionsBufferedReader.readLine()) != null &&
                    (answerLine = answersBufferedReader.readLine()) != null) {
                String[] questionData = questionLine.split(",");
                if (questionData.length == 1) {
                    Question question = new Question();
                    question.setQuestion(questionData[0]);
                    question.setAnswer(answerLine.trim());
                    questions.add(question);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return questions;
    }

    public String getCorrectAnswer(Question question) {
        for (Question q : questions) {
            if (q.getQuestion().equals(question.getQuestion())) {
                return q.getAnswer();
            }
        }
        return null;
    }
}