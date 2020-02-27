package karbonfw.p4s.domain.orders.repository;

import java.util.UUID;

import karbonfw.p4s.domain.orders.entity.Order;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface OrderRepository {

    Flux<Order> findAllOrders(String customerCode);

    Mono<Order> findById(UUID id);

    Mono<Order> save(Order order);

    Mono<Order> delete(Order order);
}
