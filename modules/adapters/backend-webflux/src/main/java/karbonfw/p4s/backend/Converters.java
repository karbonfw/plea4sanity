package karbonfw.p4s.backend;

import karbonfw.p4s.api.orders.OrderDetailsDto;
import karbonfw.p4s.api.orders.OrderDto;
import karbonfw.p4s.api.orders.OrderLineDto;
import karbonfw.p4s.domain.orders.entity.Order;
import karbonfw.p4s.domain.orders.entity.OrderLine;
import org.springframework.stereotype.Component;

@Component
public class Converters {

    public OrderDto toOrderDto(Order order) {
        return OrderDto.builder()
                .id(order.getId())
                .customerCode(order.getCustomerCode())
                .description(order.getDescription())
                .version(order.getVersion())
                .build();
    }

    public OrderLineDto toOrderLineDto(OrderLine orderLine) {
        return OrderLineDto.builder()
                .id(orderLine.getId())
                .description(orderLine.getDescription())
                .price(orderLine.getPrice())
                .quantity(orderLine.getQuantity())
                .build();
    }

    public OrderDetailsDto toOrderDetailsDto(Order order) {
        return OrderDetailsDto.builder()
                .id(order.getId())
                .customerCode(order.getCustomerCode())
                .description(order.getDescription())
                .version(order.getVersion())
                .lines(order.getLines().map(this::toOrderLineDto).asJava())
                .build();
    }
}

