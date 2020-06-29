package guru.sfg.beer.order.service.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

    private UUID id;

    private Long version;

    private OffsetDateTime createdDate;

    private OffsetDateTime lastModifiedDate;

    private String beerName;

    private String beerStyle;

    private String upc;

    private BigDecimal price;

    private Integer quantityToBrew;
    private Integer minOnHand;

}
