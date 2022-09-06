package com.br.devs.java.api.service;


import com.br.devs.java.api.model.Country;
import com.br.devs.java.api.repository.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public void deleteById(Integer id){
        repository.deleteById(id);
    }

    public Country findById(Integer id){
        return Optional.of(repository.findById(id)).get().orElse(null);
    }

    public void updateCountryByPut(Integer id, String name){
        Country country = findById(id);
        country.setName(name);
        repository.save(country);
    }

    public void updateCountryByPatch(Integer id, String name){
        Country country = findById(id);
        country.setName(name);
        repository.save(country);
    }

}
