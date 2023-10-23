package com.dev.marketplace.services;

import com.dev.marketplace.entities.Store;
import com.dev.marketplace.repositories.StoreRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class StoreService extends GenericService<UUID, Store, StoreRepository>{
}
