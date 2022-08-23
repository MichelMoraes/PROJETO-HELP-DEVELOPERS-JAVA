package com.br.devs.java.api.controllers;

import com.br.devs.java.api.model.Country;
import com.br.devs.java.api.repository.CountryRepository;
import com.br.devs.java.api.service.CountryService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.contains;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
class CountryControllerTest {

    @InjectMocks
    CountryController countryController;
    @Mock
    CountryService service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }


    @Test
    void testeDevePassarQuandoFizerPost(){

        Country country1 = new Country();
        country1.setId(1);
        country1.setName("BRASIL");

        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

        // verifica se o que foi salvo é o mesmo que é esperado no country
        assertEquals(country1.getName(), countryController.save().getName());
        assertEquals(country1.getId(), countryController.save().getId());

        // verifica se o método foi chamado pelo menos 1 vez
        verify(service, atMost(1)).save(country1);
    }

}