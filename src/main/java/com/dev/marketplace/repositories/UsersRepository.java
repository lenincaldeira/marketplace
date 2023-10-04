package com.dev.marketplace.repositories;

import com.dev.marketplace.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {

}
