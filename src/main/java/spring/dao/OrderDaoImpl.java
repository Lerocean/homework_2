package spring.dao;

import org.springframework.stereotype.Service;

@Service
public class OrderDaoImpl implements OrderDao {
    public void saveOrder(String orderId) {
        System.out.println("Сохранение заказа " + orderId);
    }
}