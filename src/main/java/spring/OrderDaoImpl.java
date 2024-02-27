package spring;
public class OrderDaoImpl implements OrderDao {
    public void saveOrder(String orderId) {
        System.out.println("Сохранение заказа " + orderId);
    }
}
