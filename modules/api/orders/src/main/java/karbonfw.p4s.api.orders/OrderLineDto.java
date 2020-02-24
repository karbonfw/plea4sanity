package karbonfw.p4s.api.orders;

import java.math.BigDecimal;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class OrderLineDto {

    private final UUID id;

    private final String description;

    private final BigDecimal quantity;

    private final BigDecimal price;
}
