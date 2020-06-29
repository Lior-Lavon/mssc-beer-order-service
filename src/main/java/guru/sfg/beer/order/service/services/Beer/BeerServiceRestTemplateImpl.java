package guru.sfg.beer.order.service.services.Beer;

import guru.sfg.beer.order.service.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.UUID;

@Slf4j
@ConfigurationProperties(prefix = "sfg.brewery", ignoreUnknownFields = false) // // map to the application.property to get the value for beerServiceHost
@Service
public class BeerServiceRestTemplateImpl implements BeerService {

    private final String BEER_UPC_PATH = "/api/v1/beerUpc/";
    private final String BEER_PATH = "/api/v1/beers/";
    private String beerServiceHost; // this will be filled from the application.service

    @Autowired
    private RestTemplate restTemplate;

    public void setBeerServiceHost(String beerServiceHost) {
        this.beerServiceHost = beerServiceHost;
    }

    @Override
    public Optional<BeerDto> getBeerById(UUID beerId) {
        // request the beer data from the Beer service
        BeerDto beerDto = restTemplate.getForObject(beerServiceHost + BEER_PATH + beerId.toString(), BeerDto.class);
        return Optional.of(beerDto);
    }

    @Override
    public Optional<BeerDto> getBeerByUpc(String upc) {
        // request the beer data from the Beer service
        BeerDto beerDto = restTemplate.getForObject(beerServiceHost + BEER_UPC_PATH + upc, BeerDto.class);
        return Optional.of(beerDto);
    }
}
