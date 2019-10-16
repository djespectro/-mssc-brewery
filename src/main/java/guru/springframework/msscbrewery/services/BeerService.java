package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.BeerDto;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

public interface BeerService {

    BeerDto getBeerById(UUID beerId);
    BeerDto add(BeerDto beerDto);
    void update(UUID beerId, BeerDto beerDto);
    void deleteById(UUID beerId);
}
