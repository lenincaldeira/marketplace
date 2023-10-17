package com.dev.marketplace.repositories;

import com.dev.marketplace.entities.Adress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdressRepository extends JpaRepository<Adress, Long> {
}
