package karbonfw.p4s.orderstore.inmem;

import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import karbonfw.plea4sanity.app.ordersmgmt.adapters.OrderRepository;
import karbonfw.plea4sanity.domain.orders.Order;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class OrderRepositoryInmem implements OrderRepository {

    private final ConcurrentMap<UUID, Order> orders = new ConcurrentHashMap<>();

    {
        final UUID id = UUID.randomUUID();
        orders.put(id, Order.builder().id(id).customerCode("123").description("foo").version(1L).build());
    }

    @Override
    public Flux<Order> findAllOrders(String customerCode) {
        Objects.requireNonNull(customerCode);
        return Flux.fromStream(
                this.orders.values().stream()
                        .filter(order -> customerCode.equals(order.getCustomerCode())));
    }

    @Override
    public Mono<Order> findById(UUID id) {
        return Mono.justOrEmpty(
                this.orders.values().stream()
                        .filter(order -> id.equals(order.getId())).findFirst());
    }

    @Override
    public Mono<Order> save(Order order) {
        this.orders.put(order.getId(), order);
        return Mono.just(this.orders.get(order.getId()));
    }

    @Override
    public Mono<Void> delete(Order order) {
        this.orders.remove(order.getId());
        return Mono.empty();
    }
}
