package karbonfw.plea4sanity.domain.orders;

import java.util.List;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Order {

    private final UUID id;

    private String customerCode;

    private long version;

    private String description;

    private List<OrderLine> lines;
}
