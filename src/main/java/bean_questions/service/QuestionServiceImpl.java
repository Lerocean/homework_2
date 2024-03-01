package bean_questions.service;

import bean_questions.dao.QuestionDao;
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
    private List<QuestionDao> questionDaos;

    @Override
    public List<QuestionDao> getQuestions() {
        if (questionDaos == null) {
            questionDaos = loadQuestions();
        }
        return questionDaos;
    }

    private List<QuestionDao> loadQuestions() {
        List<QuestionDao> questionDaos = new ArrayList<>();
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
                    QuestionDao questionDao = new QuestionDao();
                    questionDao.setQuestion(questionData[0]);
                    questionDao.setAnswer(answerLine.trim());
                    questionDaos.add(questionDao);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return questionDaos;
    }

    public String getCorrectAnswer(QuestionDao questionDao) {
        for (QuestionDao q : questionDaos) {
            if (q.getQuestion().equals(questionDao.getQuestion())) {
                return q.getAnswer();
            }
        }
        return null;
    }
}