package com.br.devs.java.api.converters;

import com.br.devs.java.api.controllers.CountryController;
import com.br.devs.java.api.service.CountryService;
import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.util.StringUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class LocalDateConverterTest {


    @InjectMocks
    LocalDateConverter localDateConverter;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }


    @Test
    void testeDevePassarNaConversaoDeDatas() {
        String data = "2022-04-10T08:55:00.000Z";

        LocalDate localDate = LocalDate.of(2022, 04, 10 );
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate2;
        localDate2 = LocalDateTime.parse(data,
                DateTimeFormatter.ISO_DATE_TIME
        ).toLocalDate();
        assertEquals(localDate2, localDate);

    }

}