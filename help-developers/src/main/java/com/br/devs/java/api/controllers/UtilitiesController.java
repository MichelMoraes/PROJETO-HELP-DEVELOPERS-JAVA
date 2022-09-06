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
@Tag(name = "5. Utilities", description = "utilities")
public class UtilitiesController {

    @Operation(summary = "Retorna utilidades")
    @GetMapping("utilities")
    public String detailUtilities() {
        return "utilities details";
    }


    @Operation(summary = "Retorna informações sobre HTTP response status codes")
    @GetMapping("status-code")
    public String statusCode() {
        return "Acesse: https://developer.mozilla.org/en-US/docs/Web/HTTP/Status";
    }

    @Operation(summary = "Retorna informações sobre o protocolo HTTP")
    @GetMapping("http")
    public String http() {
        return "Acesse:  https://developer.mozilla.org/en-US/docs/Web/HTTP";
    }







}
