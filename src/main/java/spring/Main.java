package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        FoodDeliveryService foodDeliveryService = context.getBean(FoodDeliveryServiceImpl.class);
        String orderId = "123";
        foodDeliveryService.deliverFood(orderId);
    }
}