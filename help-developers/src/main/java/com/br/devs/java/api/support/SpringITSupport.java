package com.br.devs.java.api.support;

import com.br.devs.java.api.event.ApiResponseEvent;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.sun.jdi.event.StepEvent;
import io.cucumber.spring.CucumberContextConfiguration;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.test.context.EmbeddedKafka;


@SpringBootTest
@EmbeddedKafka(
        partitions = 1,
        brokerProperties = {"listeners=PLAINTEXT://localhost:3333", "port=3333"})
@CucumberContextConfiguration
public abstract class SpringITSupport {

    @Autowired
    protected KafkaConsumer kafkaConsumer;
    @Autowired
    protected ObjectMapper objectMapper;
    @Autowired
    protected XmlMapper xmlMapper;
    @Autowired
    protected KafkaTemplate<String, StepEvent> kafkaProducer;
    @Autowired
    protected KafkaTemplate<String, ApiResponseEvent> paymentHubKafkaProducer;
    @Value("${app.kafka.topic-api}")
    protected String topicIn;


}
