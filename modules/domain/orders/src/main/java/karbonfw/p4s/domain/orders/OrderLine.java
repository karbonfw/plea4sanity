package karbonfw.p4s.domain.orders;

import java.math.BigDecimal;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class OrderLine {

    private final UUID id;

    private final String description;

    private final BigDecimal quantity;

    private final BigDecimal price;
}
