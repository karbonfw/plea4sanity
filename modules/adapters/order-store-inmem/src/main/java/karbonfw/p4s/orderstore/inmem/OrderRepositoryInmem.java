package karbonfw.p4s.orderstore.inmem;

import java.util.UUID;

import karbonfw.plea4sanity.app.ordersmgmt.adapters.OrderRepository;
import karbonfw.plea4sanity.domain.orders.Order;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class OrderRepositoryInmem implements OrderRepository {
    @Override
    public Flux<Order> findAllOrders(String customerCode) {
        return null;
    }

    @Override
    public Mono<Order> findById(UUID id) {
        return null;
    }

    @Override
    public Mono<Order> save(Order order) {
        return null;
    }

    @Override
    public Mono<Void> delete(Order order) {
        return null;
    }
}
