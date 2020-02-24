package karbonfw.p4s.backend;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class Routes {

    @Bean
    public RouterFunction<ServerResponse> routerFunction(OrderHandler orderHandler) {
        return RouterFunctions.route()
                .GET("customers/{customerCode}/orders", orderHandler::findOrders)
                .GET("customers/{customerCode}/orders/{orderId}", orderHandler::getOrder)
                .DELETE("customers/{customerCode}/orders/{orderId}", orderHandler::delete)
                .build();
    }
}
