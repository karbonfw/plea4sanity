package karbonfw.plea4sanity.app.ordersmgmt.adapters;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import karbonfw.plea4sanity.domain.orders.Order;

public interface OrderRepository {

    List<Order> findAllOrders(String customerCode);

    Optional<Order> findById(UUID id);

    Order save(Order order);

    void delete(Order order);
}
