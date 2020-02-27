package karbonfw.p4s.domain.orders.service;

import java.util.UUID;

import karbonfw.p4s.domain.orders.repository.OrderRepository;
import karbonfw.p4s.domain.orders.entity.Order;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class OrderCrudService {

    private final OrderRepository orderRepository;

    public Mono<Order> delete(String customerCode, UUID id) {
        return this.orderRepository.findById(id)
                .filter(order -> order != null && customerCode.equals(order.getCustomerCode()))
                .flatMap(this.orderRepository::delete);
    }

    public Flux<Order> findAllOrders(String customerCode) {
        return this.orderRepository.findAllOrders(customerCode);
    }

    public Mono<Order> findById(String customerCode, UUID id) {
        return this.orderRepository.findById(id)
                .filter(order -> order != null && customerCode.equals(order.getCustomerCode()));
    }

    public Mono<Order> save(Order order) {
        return this.orderRepository.save(order);
    }

}
