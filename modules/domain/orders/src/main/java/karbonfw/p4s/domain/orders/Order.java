package karbonfw.p4s.domain.orders;

import java.util.UUID;

import io.vavr.collection.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class Order {

    private final UUID id;

    private final String customerCode;

    private final long version;

    private final String description;

    private final List<OrderLine> lines;
}
