package com.br.devs.java.api.service;


import com.br.devs.java.api.model.Country;
import com.br.devs.java.api.repository.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryService {

    @Autowired
    private final CountryRepository repository;

    public List<Country> allCountries(){
        return repository.findAll();
    }

    public Country save(Country country){
        return repository.save(country);
    }


}
