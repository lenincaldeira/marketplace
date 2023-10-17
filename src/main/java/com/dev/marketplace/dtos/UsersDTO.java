package com.dev.marketplace.dtos;

import com.dev.marketplace.entities.Adress;
import lombok.Data;

import java.time.LocalDate;

@Data
public class UsersDTO {

    private Long id;
    private String name;
    private LocalDate dateOfBirth;
    private String password;
    private String email;
    private Adress adress;

    public UsersDTO() {
    }

    public UsersDTO(Long id, String name, LocalDate dateOfBirth, String password, String email, Adress adress) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.password = password;
        this.email = email;
        this.adress = adress;
    }
}
