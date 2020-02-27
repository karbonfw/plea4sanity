package karbonfw.p4s.backend;

import karbonfw.p4s.orderstore.inmem.OrderRepositoryInmem;
import karbonfw.p4s.domain.orders.repository.OrderRepository;
import karbonfw.p4s.domain.orders.service.OrderCrudService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Producers {

    @Bean
    public OrderRepository orderRepository() {
        return new OrderRepositoryInmem();
    }

    @Bean
    public OrderCrudService orderCrudService(OrderRepository orderRepository) {
        return new  OrderCrudService(orderRepository);
    }
}
