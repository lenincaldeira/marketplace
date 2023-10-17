package com.dev.marketplace.dtos;

import lombok.Data;

@Data
public class ProductsDTO {
    private Long id;

    public ProductsDTO() {
    }

    public ProductsDTO(Long id) {
        this.id = id;
    }
}

