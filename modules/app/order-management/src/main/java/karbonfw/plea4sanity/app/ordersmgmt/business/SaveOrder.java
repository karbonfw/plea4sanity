package karbonfw.plea4sanity.app.ordersmgmt.business;

import java.util.function.Function;

import karbonfw.plea4sanity.app.ordersmgmt.adapters.OrderRepository;
import karbonfw.plea4sanity.domain.orders.Order;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SaveOrder implements Function<Order, Order> {

    private final OrderRepository orderRepository;

    @Override
    public Order apply(Order order) {
        return this.orderRepository.save(order);
    }
}
