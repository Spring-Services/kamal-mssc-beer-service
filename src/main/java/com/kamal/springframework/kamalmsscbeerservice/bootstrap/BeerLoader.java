package com.kamal.springframework.kamalmsscbeerservice.bootstrap;

import com.kamal.springframework.kamalmsscbeerservice.domain.Beer;
import com.kamal.springframework.kamalmsscbeerservice.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {

        if(beerRepository.count() == 0){

            beerRepository.save(Beer.builder()
                    .beerName("BudLight")
                    .beerStyle("ALE")
                    .quantityToBrew(200)
                    .minOnHand(2)
                    .price(new BigDecimal(12.95))
                    .upc(3234700001L)
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Heineken")
                    .beerStyle("IPA")
                    .quantityToBrew(300)
                    .minOnHand(3)
                    .price(new BigDecimal(11.95))
                    .upc(3234700002L)
                    .build());

        }

    }
}
