package com.br.devs.java.api.controllers;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping(value = "/api/v1/java/")
@RequiredArgsConstructor
@Tag(name = "2. Functional ", description = "Functional programming")
public class FunctionalController {

    @Operation(summary = "Retorna os detalhes sobre functional programming")
    @GetMapping("functional")
    public String detailFunctional() {

        //Antes do Java 8
        List<Integer> itens = Arrays.asList(11, 10, 16, 5, 85);
        for (Integer item : itens) {
            if (item == 16)
                System.out.println(item);
        }

        // Com Java 8 usando Streams e Lambda
        List<Integer> itenss = Arrays.asList(11, 10, 16, 5, 85);

        itens.stream().filter(i -> i == 16).forEach(System.out::println);

        String detail =

        "\n"+
        "\n"+
        "//Antes do Java 8\n"+
        "List<Integer> itens = Arrays.asList(11, 10, 16, 5, 85);\n"+
        "for (Integer item : itens) {\n"+
            "if (item == 16)\n"+
                "System.out.println(item);\n"+
        "}"+

        "// Com Java 8 usando Streams e Lambda\n"+
        "List<Integer> itenss = Arrays.asList(11, 10, 16, 5, 85);\n"+

        "itens.stream().filter(i -> i == 16).forEach(System.out::println);\n"+
        "\n"+
        "\n";

        return detail;
    }


}
