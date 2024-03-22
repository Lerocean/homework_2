package bean_questions.aspect;

import bean_questions.dao.QuestionDao;
import bean_questions.model.Question;
import bean_questions.service.QuestionServiceImpl;

public class AnotherProxy extends QuestionServiceImpl {
    public AnotherProxy(QuestionDao dao) {
        super(dao);
    }

    public Question getQuestion {
        System.out.println("я логирую");
        Question sayHello = super.sayHello(name);
        System.out.println("я закончил логировать");

        return sayHello;
    }
}
