package com.dev.marketplace.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Data
public class Adress {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;

    private String street;
    private String city;
    private String state;
    private String country;
    private String postalCode;

}
