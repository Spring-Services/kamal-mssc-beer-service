package com.kamal.springframework.kamalmsscbeerservice.repositories;

import com.kamal.springframework.kamalmsscbeerservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
