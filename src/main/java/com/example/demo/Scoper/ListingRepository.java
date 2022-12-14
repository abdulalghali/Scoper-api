package com.example.demo.Scoper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ListingRepository extends JpaRepository<Listing, Long> {
    Optional<Listing>findListingByAddress(String address);


    void delete(Listing listing);
}

