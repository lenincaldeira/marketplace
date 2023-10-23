package com.dev.marketplace.services;

import com.dev.marketplace.entities.Adress;
import com.dev.marketplace.repositories.AdressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdressService {

    @Autowired
    private AdressRepository adressRepository;

    public List<Adress> findAll() { return adressRepository.findAll(); }
    public Adress findById(Long idAdress) { return adressRepository.findById(idAdress).orElse(null);}

    public Adress create(Adress adress) { return adressRepository.save(adress); }
    public Adress update(Adress adress) { return adressRepository.save(adress);}
    public void delete(Long idAdress) { adressRepository.deleteById(idAdress);}


}
