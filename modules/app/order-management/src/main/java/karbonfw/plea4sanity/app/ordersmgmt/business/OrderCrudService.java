package karbonfw.plea4sanity.app.ordersmgmt.business;

import java.util.Optional;
import java.util.UUID;

import io.vavr.collection.List;
import karbonfw.plea4sanity.app.ordersmgmt.adapters.OrderRepository;
import karbonfw.plea4sanity.domain.orders.Order;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class OrderCrudService {

    private final OrderRepository orderRepository;

    public void delete(UUID id) {
        this.orderRepository.findById(id).ifPresent(this.orderRepository::delete);
    }

    public List<Order> findAllOrders(String customerCode) {
        return this.orderRepository.findAllOrders(customerCode);
    }

    public Optional<Order> findById(UUID id) {
        return this.orderRepository.findById(id);
    }

    public Order save(Order order) {
        return this.orderRepository.save(order);
    }

}
