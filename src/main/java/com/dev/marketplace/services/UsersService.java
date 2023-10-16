package com.dev.marketplace.services;

import com.dev.marketplace.entities.Users;
import com.dev.marketplace.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

@Service
public class UsersService {

    @Autowired
    private UsersRepository repository;

    public List<Users> findAll() {
        return repository.findAll();
    }

    public Users findById(Long idUsers) {
        return repository.findById(idUsers).orElse(null);
    }

    public Users create(Users users) {
        return repository.save(users);
    }

    public Users update(Users users) {
        return repository.save(users);
    }

    public void delete(Long idUsers) {
        repository.deleteById(idUsers);
    }

    private void validateMinimumAge(LocalDate birthDate) {
        LocalDate currentDate = LocalDate.now();
        int age = Period.between(birthDate, currentDate).getYears();
        if (age < 18) {
            throw new IllegalArgumentException("The user must be at least 18 years old.");
        }
    }
}
