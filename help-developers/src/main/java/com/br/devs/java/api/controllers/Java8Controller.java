package com.br.devs.java.api.controllers;


import com.br.devs.java.api.exception.ApiValidationException;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/")
@RequiredArgsConstructor
@Tag(name = "1. Java 8", description = "Funcionalidades da versão.")
public class Java8Controller {

   // private final MetricsService metricsService;
    private static final long MINUTES_MAX = 10080;
    private static final long MINUTES_MIN = 0;


    @Operation(summary = "Retorna o detalhe de xxxx")
    @GetMapping("/java/8")
    public List<String> detail(@Valid @NotNull @Param(value = "minutes") long minutes) {
        validateMinutes(minutes);
        return new ArrayList<String>();
    }

    private void validateMinutes(long minutes) {
        if (minutes < MINUTES_MIN  || minutes > MINUTES_MAX) {
            throw new ApiValidationException(
                    "xxx");
        }
    }


}
