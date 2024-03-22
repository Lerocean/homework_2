package bean_questions.service;

import bean_questions.model.Question;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnotherServiceImpl implements QuestionService {
    public void sayGreeting() {
        System.out.println("Приветики");
    }

    public void sayFarewell() {
        System.out.println("Пистолетики");
    }

    @Override
    public void sayGoodbye(String name) {

    }

    @Override
    public void sayGreeting(String name) {

    }

    @Override
    public void sayFarewell(String name) {

    }

    @Override
    public void askQuestions() {

    }

    @Override
    public void sayHello(String name) {

    }

    @Override
    public void sayPassword(String password) {

    }

    @Override
    public void sayAge(String riddle) {

    }

    @Override
    public void sayYear(int year) {

    }



    @Override
    public List<Question> getQuestions() {
        return null;
    }

    @Override
    public String getCorrectAnswer(Question question) {
        return null;
    }
}


