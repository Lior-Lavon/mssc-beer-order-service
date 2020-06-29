package guru.sfg.beer.order.service.services.Beer;

import guru.sfg.beer.order.service.web.model.BeerDto;
import org.springframework.http.ResponseEntity;

import java.util.Optional;
import java.util.UUID;

public interface BeerService {

    Optional<BeerDto> getBeerById(UUID beerId);
    Optional<BeerDto> getBeerByUpc(String upc);
}
