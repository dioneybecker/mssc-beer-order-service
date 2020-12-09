package com.dioneybecker.brewery.model.events;

import com.dioneybecker.brewery.model.BeerDto;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class BrewBeerEvent extends BeerEvent {

    private static final long serialVersionUID = 1L;

    public BrewBeerEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
