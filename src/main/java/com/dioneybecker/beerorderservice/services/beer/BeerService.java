package com.dioneybecker.beerorderservice.services.beer;

import java.util.Optional;
import java.util.UUID;

import com.dioneybecker.brewery.model.BeerDto;

public interface BeerService {

    Optional<BeerDto> getBeerById(UUID beerId);

    Optional<BeerDto> getBeerByUpc(String upc);
    
}
