package bean_questions.dao;

import bean_questions.model.Question;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionDao {

    public List<Question> loadQuestions() {
        List<Question> questions = new ArrayList<>();

        try (BufferedReader questionsBufferedReader = getBufferedReaderForFile("questions.csv");
             BufferedReader answersBufferedReader = getBufferedReaderForFile("answers.csv")) {

            String questionLine;
            String answerLine;
            while ((questionLine = questionsBufferedReader.readLine()) != null &&
                    (answerLine = answersBufferedReader.readLine()) != null) {

                Question question = new Question();
                question.setQuestion(questionLine.trim());
                question.setAnswer(answerLine.trim());
                questions.add(question);

            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения вопросов, попробуйте снова");
        }
        return questions;
    }

    private BufferedReader getBufferedReaderForFile(String fileName) throws IOException {
        InputStream inputStream = new ClassPathResource(fileName).getInputStream();
        InputStreamReader reader = new InputStreamReader(inputStream);
        return new BufferedReader(reader);
    }
}
