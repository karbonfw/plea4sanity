package karbonfw.plea4sanity.app.ordersmgmt.business;

import java.util.UUID;

import karbonfw.plea4sanity.app.ordersmgmt.adapters.OrderRepository;
import karbonfw.plea4sanity.domain.orders.Order;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class OrderCrudService {

    private final OrderRepository orderRepository;

    public Mono<Void> delete(UUID id) {
        return this.orderRepository.findById(id).flatMap(this.orderRepository::delete);
    }

    public Flux<Order> findAllOrders(String customerCode) {
        return this.orderRepository.findAllOrders(customerCode);
    }

    public Mono<Order> findById(UUID id) {
        return this.orderRepository.findById(id);
    }

    public Mono<Order> save(Order order) {
        return this.orderRepository.save(order);
    }

}
