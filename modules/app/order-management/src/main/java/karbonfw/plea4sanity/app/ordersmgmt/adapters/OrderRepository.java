package karbonfw.plea4sanity.app.ordersmgmt.adapters;

import java.util.UUID;

import karbonfw.plea4sanity.domain.orders.Order;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface OrderRepository {

    Flux<Order> findAllOrders(String customerCode);

    Mono<Order> findById(UUID id);

    Mono<Order> save(Order order);

    Mono<Void> delete(Order order);
}
