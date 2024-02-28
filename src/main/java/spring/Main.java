package spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import spring.service.FoodDeliveryService;
import wrongPackage.WrongService;

@ComponentScan
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

        FoodDeliveryService foodDeliveryService = context.getBean(FoodDeliveryService.class);
        String orderId = "123";
        foodDeliveryService.deliverFood(orderId);

        WrongService wrongService = context.getBean(WrongService.class);
        System.out.println("Ok i got wrong service");
    }
}