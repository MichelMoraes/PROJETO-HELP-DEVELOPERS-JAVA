package com.br.devs.java.api.controllers;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api/v1/java/")
@RequiredArgsConstructor
@Tag(name = "2. Functional ", description = "Functional programming")
public class FunctionalController {

    @Operation(summary = "Retorna os detalhes sobre functional programming")
    @GetMapping("functional")
    public String detailFunctional() {
        return "functional details";
    }


}
