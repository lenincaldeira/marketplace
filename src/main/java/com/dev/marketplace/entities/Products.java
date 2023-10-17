package com.dev.marketplace.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;
}
