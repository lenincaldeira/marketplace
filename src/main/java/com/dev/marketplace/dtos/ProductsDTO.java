package com.dev.marketplace.dtos;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record ProductsDTO (
        UUID id,
        @NotNull(message = "The product name is mandatory!")
        @NotBlank(message = "The product name is mandatory!")
        @Min(value = 3, message = "The product name is too short!") String name) {
}

