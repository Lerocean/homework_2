package bean_questions.aspect;

import bean_questions.service.AnotherService;
import org.springframework.stereotype.Service;

@Service
public class AnotherProxy extends AnotherService {

    @Override
    public void sayGreeting() {
        System.out.println("я логирую");
        super.sayGreeting();
        System.out.println("я закончил логировать");
    }

}
