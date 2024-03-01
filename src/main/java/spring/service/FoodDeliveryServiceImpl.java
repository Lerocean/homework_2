package spring.service;

import org.springframework.stereotype.Service;
import spring.dao.OrderDao;

@Service
public class FoodDeliveryServiceImpl implements FoodDeliveryService {
    private final OrderDao orderDao;

    public FoodDeliveryServiceImpl(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public void deliverFood(String orderId) {
        System.out.println("Доставка еды для заказа " + orderId);
        orderDao.saveOrder(orderId);
    }
}
