package com.kamal.springframework.kamalmsscbeerservice.web.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

public class BeerDto {

    private UUID id;
    private Integer version;
    private Long upc;
    private Integer quantityOnHand;
    private BigDecimal price;
    private String beerName;
    private BeerStyleEnum beerStyle;
    private OffsetDateTime createdDate;
    private OffsetDateTime lastModifiedDate;



}
