package guru.sfg.beer.order.service.services.Beer;

import guru.sfg.beer.order.service.web.model.BeerDto;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

//@Disabled
@SpringBootTest
class BeerServiceRestTemplateImplTest {

    @Autowired
    BeerService beerService;

    @MockBean
    RestTemplate restTemplate;

    @Test
    void getOnhandBeerData() {

        String upc = "00732834762897";
        BeerDto beerDto = beerService.getBeerByUpc(upc).get();

        System.out.println(beerDto.toString());
    }
}