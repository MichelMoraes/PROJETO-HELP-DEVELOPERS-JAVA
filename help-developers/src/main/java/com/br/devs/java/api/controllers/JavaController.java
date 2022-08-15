package com.br.devs.java.api.controllers;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RestController
@RequestMapping(value = "/api/v1/java/")
@RequiredArgsConstructor
@Tag(name = "1. Java (8/11/17)", description = "Funcionalidades da versão.")
public class JavaController {

    @Operation(summary = "Retorna os detalhes da versão do Java ")
    @GetMapping("version")
    public String detail(@Valid @NotNull @Param(value = "version") long version) {
        String detalhes = null;
        if ( version == 8 ){
            detalhes = "Java 8";
        }

        if ( version == 11 ){
            detalhes = "Java 11";
        }

        if ( version == 17 ){
            detalhes = "Java 17";
        }

        return detalhes;
    }


}
