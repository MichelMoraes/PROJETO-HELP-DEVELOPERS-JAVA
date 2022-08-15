package com.br.devs.java.api.controllers;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/")
@RequiredArgsConstructor
@Tag(name = "3. Testes Unitários ", description = "Testes Unitários")
public class TestesUnitariosController {

    @Operation(summary = "Retorna os detalhes sobre Testes Unitários")
    @GetMapping("testes")
    public String detailTestes() {
        return "Testes Unitários details";
    }


}
