package com.example.demo.Scoper;

import javax.persistence.*;

@Entity
@Table
public class Listing {
    @Id
    @SequenceGenerator(
            name = "listing_sequence",
            sequenceName = "listing_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "listing_sequence"
    )
    private Long id;
    private String imageUrl;
    private String city;
    private String address;
    private String houseType;
    private Integer price;
    private Integer bedrooms;
    private Integer bathrooms;
    @Column(nullable = false)
    private boolean sold = false;

    @Column(nullable = false)
    private boolean saved = false;
    public Listing() {
    }


    public Listing(String imageUrl, String city, String address, String houseType, Integer price, Integer bedrooms, Integer bathrooms) {
        this.imageUrl = imageUrl;
        this.city = city;
        this.address = address;
        this.houseType = houseType;
        this.price = price;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
    }

    public Listing(boolean saved) {
        this.saved = saved;
    }

    public boolean isSaved() {
        return saved;
    }

    public void setSaved(boolean saved) {
        this.saved = saved;
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(Integer bedrooms) {
        this.bedrooms = bedrooms;
    }

    public Integer getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(Integer bathrooms) {
        this.bathrooms = bathrooms;
    }

    @Override
    public String toString() {
        return "Listing{" +
                "id=" + id +
                ", imageUrl='" + imageUrl + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", houseType='" + houseType + '\'' +
                ", price=" + price +
                ", bedrooms=" + bedrooms +
                ", bathrooms=" + bathrooms +
                '}';
    }
}
