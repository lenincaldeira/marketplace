package com.dev.marketplace.dtos;

import com.dev.marketplace.validations.UserAgeConstraint;
import jakarta.validation.constraints.*;

import java.time.LocalDate;
import java.util.UUID;

public record UsersDTO(
        UUID id,
        @NotNull(message = "The name is mandatory!")
        @NotBlank(message = "The name is mandatory!")
        @Min(value = 3, message = "The name is too short!") String name,
        @UserAgeConstraint
        @NotNull(message = "The date of birth is mandatory!")
        @Past(message = "Invalid date of birth!") LocalDate dateOfBirth,
        @NotNull(message = "The email is mandatory!")
        @Email(message = "Invalid e-mail!") String email,
        String password) {

}