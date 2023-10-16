package com.dev.marketplace.entities;

import com.dev.marketplace.validations.UserAgeConstraint;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDate;

@Data
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;

    @Size(min = 10, message = "The name is too short!")
    @NotBlank(message = "The name is mandatory!")
    private String name;

    @Past(message = "Invalid date of birth")
    @UserAgeConstraint
    private LocalDate dateOfBirth;

    @NotNull
    @NotBlank(message = "New password is mandatory")
    private String password;

    @Email(message = "Invalid e-mail!")
    @NotBlank(message = "The e-mail is mandatory!")
    private String email;

    @OneToOne
    private Adress adress;
}
