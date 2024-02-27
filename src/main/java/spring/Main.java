package spring;

import ru.spring.OrderDaoImpl;
import ru.fedynko.*;
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        FoodDeliveryService foodDeliveryService = context.getBean(FoodDeliveryService.class);
        String orderId = "123";
        foodDeliveryService.deliverFood(orderId);
    }
}