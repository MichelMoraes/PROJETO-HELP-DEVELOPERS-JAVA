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
@Tag(name = "4. Testes de Integração ", description = "Testes de Integração")
public class TestesDeIntegracaoController {

    @Operation(summary = "Retorna os detalhes sobre Testes de Integração")
    @GetMapping("testes-integracao")
    public String detailJava8() {
        return "Testes de Integração details";
    }


}
