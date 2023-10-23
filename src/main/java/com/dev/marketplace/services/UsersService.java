package com.dev.marketplace.services;

import com.dev.marketplace.entities.Users;
import com.dev.marketplace.repositories.UsersRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UsersService extends GenericService<UUID, Users, UsersRepository> {
}
