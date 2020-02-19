package karbonfw.plea4sanity.app.ordersmgmt.business;

import java.util.List;
import java.util.function.Function;

import karbonfw.plea4sanity.app.ordersmgmt.adapters.OrderRepository;
import karbonfw.plea4sanity.domain.orders.Order;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FindAllOrdersForCustomer implements Function<String, List<Order>> {

    private final OrderRepository orderRepository;

    @Override
    public List<Order> apply(String customerCode) {
        return this.orderRepository.findAllOrders(customerCode);
    }
}
