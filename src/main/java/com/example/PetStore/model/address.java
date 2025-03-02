package com.example.PetStore.model;

import jakarta.persistence.*;

@Entity
@Table(name = "address")
public class address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String street;

    @Column
    private String city;

    @Column
    private String number;

    @Column
    private String zipCode;

    public address() {}

    public address(String street, String city, String number, String zipCode) {
        this.street = street;
        this.city = city;
        this.number = number;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "address{" +
                "id=" + id +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", number='" + number + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
