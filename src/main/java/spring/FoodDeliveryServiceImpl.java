package spring;

public class FoodDeliveryServiceImpl implements FoodDeliveryService {
    public void deliverFood(String orderId) {
        System.out.println("Доставка еды для заказа " + orderId);
    }
}
