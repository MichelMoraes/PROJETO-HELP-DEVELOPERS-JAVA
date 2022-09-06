package com.br.devs.java.api.controllers;


import com.br.devs.java.api.model.Country;
import com.br.devs.java.api.service.CountryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;


@RestController
@RequestMapping(value = "/api/v1/jpa/")
@RequiredArgsConstructor
@Tag(name = "Exemplo de Busca JPA", description = "O get faz uma busca em todos Countries registrado no H2 em memory")
public class CountryController {

    @Autowired
    private final CountryService service;

    @Operation(summary = "Retorna todos Countries cadastrados no H2")
    @RequestMapping(value="countries", method= RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody  List<Country> getAll() {
        List<Country> countriesList = service.allCountries();
    return countriesList;
    }

    @Operation(summary = "Faz inserção de um novo Countries no H2")
    @RequestMapping(value="country", method= RequestMethod.POST, produces= MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody  Country save() {
        Country country = new Country();
        country.setId(getAll().size()+1);
        country.setName("BRASIL " + (getAll().size()+ Integer.valueOf(1)));
        service.save(country);
        return country;
    }

    @Operation(summary = "Delete um Countries pelo Id")
    @RequestMapping(value="country", method= RequestMethod.DELETE, produces= MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    void delete(@Valid @NotNull @Param(value = "id") Integer id) {
        service.deleteById(id);
    }

    @Operation(summary = "Procura um Countries pelo Id")
    @RequestMapping(value="country", method= RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Country find(@Valid @NotNull @Param(value = "id") Integer id) {
        return service.findById(id);
    }


    @Operation(summary = "Atualiza um Country pelo Método Put")
    @RequestMapping(value="country", method= RequestMethod.PUT, produces= MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    void updateWithPUT(@Valid @NotNull @Param(value = "id") Integer id, @Valid @NotNull @RequestBody String name) {
        service.updateCountryByPut(id, name);
    }

    @Operation(summary = "Atualiza um Country pelo Método PATCH")
    @RequestMapping(value="country", method= RequestMethod.PATCH, produces= MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    void updateWithPATCH(@Valid @NotNull @Param(value = "id") Integer id,@Valid @NotNull @RequestBody String name) {
        service.updateCountryByPut(id, name);
    }


}
