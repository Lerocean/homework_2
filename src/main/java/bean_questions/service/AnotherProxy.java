package bean_questions.service;

import org.springframework.stereotype.Service;

@Service
public class AnotherProxy extends AnotherService {

    @Override
    public void sayGreeting() {
        System.out.println("я логирую say greeting");
        super.sayGreeting();
        System.out.println("я закончил логировать say greeting");
    }

    @Override
    public void sayFarewell() {
        System.out.println("я логирую say goodbye");
        super.sayFarewell();
        System.out.println("я закончил логировать say goodbye");
    }
}
