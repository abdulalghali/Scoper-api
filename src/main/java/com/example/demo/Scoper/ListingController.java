package com.example.demo.Scoper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
@RequestMapping(path = "api/listings")
public class ListingController {
    private final ListingService listingService;
    @Autowired
    public ListingController(ListingService listingService) {
        this.listingService = listingService;
    }


    @GetMapping
    public List<Listing> GetStudents() {
        return listingService.GetStudents();
    }
    @PostMapping
    public Listing registerNewListing(@RequestBody Listing listing) {
        return listingService.addNewListing(listing);
    }

    @DeleteMapping
    public void deleteListing(@RequestBody Listing listing) {
        listingService.deleteListing(listing);
    }

    @PutMapping
    public Listing updateListing(@RequestBody Listing updatedListing) {
            return listingService.updateListing(updatedListing);
    }
}
