package karbonfw.p4s.api.orders;

import java.util.List;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class OrderDetailsDto {

    private final UUID id;

    private final String customerCode;

    private final long version;

    private final String description;

    private final List<OrderLineDto> lines;
}
