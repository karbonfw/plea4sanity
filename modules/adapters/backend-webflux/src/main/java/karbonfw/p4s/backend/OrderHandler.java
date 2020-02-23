package karbonfw.p4s.backend;

import java.util.ArrayList;

import karbonfw.plea4sanity.app.ordersmgmt.business.OrderCrudService;
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
        return orderCrudService.findAllOrders(serverRequest.pathVariable("customerCode"))
                .collect(ArrayList::new, ArrayList::add)
                .flatMap(orders -> ServerResponse.ok().bodyValue(orders));

    }
}
