package com.dioneybecker.brewery.model.events;

import com.dioneybecker.brewery.model.BeerDto;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class NewInventoryEvent extends BeerEvent {

    private static final long serialVersionUID = 1L;

    public NewInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
