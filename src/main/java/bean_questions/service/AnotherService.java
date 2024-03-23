package bean_questions.service;

public class AnotherService implements AnotherServiceInterface {

    @Override
    public void sayGreeting() {
        System.out.println("Приветики");
    }

    @Override
    public void sayFarewell() {
        System.out.println("Пистолетики");
    }
}


