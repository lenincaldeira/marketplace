package com.dev.marketplace.controllers;

import com.dev.marketplace.entities.Store;
import com.dev.marketplace.services.StoreService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("stores")
public class StoreController extends GenericController<UUID, Store, StoreService> {

}
