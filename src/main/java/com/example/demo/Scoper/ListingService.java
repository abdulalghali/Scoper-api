package com.example.demo.Scoper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListingService {

    private final ListingRepository listingRepository;
    @Autowired
    public ListingService(ListingRepository listingRepository) {
        this.listingRepository = listingRepository;
    }


    public List<Listing> GetStudents() {
        return listingRepository.findAll();
    }

    public Listing addNewListing(Listing listing) {
        Listing savedListing = listingRepository.save(listing);
            return savedListing;
    }
    public void deleteListing(Listing listing) {
            listingRepository.delete(listing);
        }

    public Listing updateListing(Listing listing) {
        return listingRepository.save(listing);
    }
}