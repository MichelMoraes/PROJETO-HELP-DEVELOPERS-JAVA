package com.br.devs.java.api.health;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Map;

@Component
public class MicroserviceHealthIndicator implements HealthIndicator {

    @Value("${pom.version}")
    private String version;

    @Override
    public Health health() {
        Health.Builder builder = new Health.Builder();

        Map<String, String> detailsMap = Collections.singletonMap("version", this.version);

        return builder
                .withDetails(detailsMap)
                .build();
    }
}
