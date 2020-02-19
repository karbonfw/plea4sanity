package karbonfw.plea4sanity.domain.orders;

import java.math.BigDecimal;
import java.util.UUID;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderLine {

    private final UUID id;

    private String description;

    private BigDecimal quantity;

    private BigDecimal price;
}
