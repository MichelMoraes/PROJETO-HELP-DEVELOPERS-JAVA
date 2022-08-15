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
@Tag(name = "7. JPA, Mongo e JDBC", description = "Informações relacionadas a JPA, Mongo e JDBC")
public class JPAMongoJDBCController {

    @Operation(summary = "Retorna informações relacionadas a Jpa Repository")
    @GetMapping("jpaRepository")
    public String detailJpa() {
        return "Jpa details";
    }

    @Operation(summary = "Retorna informações relacionadas a Mongo Repository")
    @GetMapping("mongoRepository")
    public String detailMongo() {
        return "Mongo details";
    }


    @Operation(summary = "Retorna informações relacionadas a JDBC")
    @GetMapping("jdbc")
    public String detailJDBC() {
        return "JDBC details";
    }

}
