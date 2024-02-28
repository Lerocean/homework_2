package spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.dao.OrderDao;
import spring.dao.OrderDaoImpl;
import spring.service.FoodDeliveryService;
import spring.service.FoodDeliveryServiceImpl;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public OrderDao getOrderDao() {
        return new OrderDaoImpl();
    }

    @Bean
    public FoodDeliveryService getFoodDeliveryService(OrderDao orderDao) {
        return new FoodDeliveryServiceImpl(orderDao);
    }
}
