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
@Tag(name = "6. Banco de Dados", description = "Informações relacionadas a Banco de Dados")
public class BancoDeDadosController {

    @Operation(summary = "Retorna informações relacionadas a Banco de Dados")
    @GetMapping("banco-de-dados")
    public String detailJava8() {
        return "Banco de Dados details";
    }


}
