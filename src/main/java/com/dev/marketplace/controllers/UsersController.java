package com.dev.marketplace.controllers;

import com.dev.marketplace.entities.User;
import com.dev.marketplace.services.UsersService;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("users")
public class UsersController extends GenericController<UUID, User, UsersService> {
}