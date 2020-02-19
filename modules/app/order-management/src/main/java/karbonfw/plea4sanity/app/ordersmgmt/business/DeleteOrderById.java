package karbonfw.plea4sanity.app.ordersmgmt.business;

import java.util.UUID;
import java.util.function.Consumer;

import karbonfw.plea4sanity.app.ordersmgmt.adapters.OrderRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DeleteOrderById implements Consumer<UUID> {

    private final OrderRepository orderRepository;

    @Override
    public void accept(UUID id) {
        this.orderRepository.findById(id).ifPresent(this.orderRepository::delete);
    }
}
