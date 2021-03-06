package karbonfw.p4s.backend.rest;

import java.util.UUID;

import karbonfw.p4s.backend.converter.OrderConverter;
import karbonfw.p4s.domain.orders.service.OrderCrudService;
import karbonfw.p4s.domain.orders.entity.Order;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@Component
public class OrderHandler {

    private final OrderCrudService orderCrudService;

    private final OrderConverter orderConverter;

    public Mono<ServerResponse> findOrders(ServerRequest serverRequest) {
        return ServerResponse
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(orderCrudService.findAllOrders(serverRequest.pathVariable("customerCode")).map(orderConverter::toOrderDto),
                        Order.class);
    }

    public Mono<ServerResponse> getOrder(ServerRequest serverRequest) {
        return ServerResponse
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(orderCrudService.findById(
                        serverRequest.pathVariable("customerCode"),
                        UUID.fromString(serverRequest.pathVariable("orderId"))).map(orderConverter::toOrderDetailsDto),
                        Order.class);
    }

    public Mono<ServerResponse> delete(ServerRequest serverRequest) {
        return orderCrudService
                .delete(serverRequest.pathVariable("customerCode"), UUID.fromString(serverRequest.pathVariable("orderId")))
                .flatMap(order -> {
                    if (order != null) {
                        return ServerResponse.ok().build();
                    } else {
                        return ServerResponse.notFound().build();
                    }
                });
    }
}
