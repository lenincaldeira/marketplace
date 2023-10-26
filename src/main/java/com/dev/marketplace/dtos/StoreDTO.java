package com.dev.marketplace.dtos;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CNPJ;

import java.util.UUID;

public record StoreDTO(
        UUID id,
        @Min(value = 3, message = "The store name is too short!")
        @NotBlank(message = "The store name is mandatory!")
        @NotNull(message = "The store name is mandatory!") String name,

        @CNPJ(message = "Invalid CNPJ") Long cnpj) {

}
