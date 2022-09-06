package com.br.devs.java.api.converters;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import com.opencsv.bean.AbstractBeanField;


public class LocalDateConverter extends AbstractBeanField<String, LocalDate> {

    @Override
    protected LocalDate convert(String value) {
        LocalDate ld = LocalDate.parse(value, DateTimeFormatter.ISO_LOCAL_DATE_TIME);

        return ld;
    }
}
