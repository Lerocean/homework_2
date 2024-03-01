package spring.wrongPackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import spring.model.Car;

@Service
public class WrongService {

    private final ObjectMapper objectMapper;

    public WrongService(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public void printCar() {
        Car car = new Car();
        car.setModel("Lada");
        car.setYear(1990);

        System.out.println(objectMapper.valueToTree(car));
    }
}
