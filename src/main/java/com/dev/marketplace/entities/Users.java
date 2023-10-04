package com.dev.marketplace.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NonNull;

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
    @NotBlank(message = "Date of birth is mandatory!")
    private LocalDate dateOfBirth;

    @NonNull
    @NotBlank(message = "New password is mandatory")
    private String password;

    @Email(message = "Invalid e-mail!")
    @NotBlank(message = "The e-mail is mandatory!")
    private String email;

}
