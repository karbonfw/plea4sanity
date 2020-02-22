package karbonfw.p4s.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import karbonfw.plea4sanity.app.ordersmgmt.business.OrderCrudService;
import karbonfw.plea4sanity.domain.orders.Order;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@Component
public class OrderHandler {

    private final OrderCrudService orderCrudService;

    public Mono<ServerResponse> findOrders(ServerRequest serverRequest) {
        final List<Order> orders = new ArrayList<>();
        final CompletableFuture<ServerResponse> future = new CompletableFuture<>();

        orderCrudService.findAllOrders(serverRequest.pathVariable("customerCode")).subscribe(
                orders::add,
                error -> {},
                () -> future.complete(ServerResponse.ok().bodyValue(orders).block())
        );
        return Mono.fromFuture(future);
    }
}
