package com.dev.marketplace.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Adress {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;
    private String street;
    private Integer number;

    private String complement;
    private String landMark;
    private String city;
    private String state;
    private String country;
    private String postalCode;

}
