package com.dioneybecker.beerorderservice.services;

import com.dioneybecker.beerorderservice.domain.BeerOrder;

public interface BeerOrderManager {
    
    BeerOrder newBeerOrder(BeerOrder beerOrder);
    
    
}
