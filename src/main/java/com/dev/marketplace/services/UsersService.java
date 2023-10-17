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
    private UsersRepository usersRepository;

    public List<Users> findAll() {
        return usersRepository.findAll();
    }

    public Users findById(Long idUsers) {
        return usersRepository.findById(idUsers).orElse(null);
    }

    public Users create(Users users) {
        return usersRepository.save(users);
    }

    public Users update(Users users) {
        return usersRepository.save(users);
    }

    public void delete(Long idUsers) {
        usersRepository.deleteById(idUsers);
    }

    private void validateMinimumAge(LocalDate birthDate) {
        LocalDate currentDate = LocalDate.now();
        int age = Period.between(birthDate, currentDate).getYears();
        if (age < 18) {
            throw new IllegalArgumentException("The user must be at least 18 years old.");
        }
    }
}
