package com.dioneybecker.brewery.model.events;

import java.io.Serializable;

import com.dioneybecker.brewery.model.BeerDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BeerEvent implements Serializable{

    private static final long serialVersionUID = 1L;

    private BeerDto beerDto;
    
}
