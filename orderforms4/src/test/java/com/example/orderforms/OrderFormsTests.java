package com.example.orderforms;

import com.example.orderforms.controller.FormController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class OrderFormsTests {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private FormController formController;

    @Test
    public void contexLoads() throws Exception {
        assertThat(formController).isNotNull();
    }

    @Test
    void httpsRequestsTest() {

    assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/",
            String.class)).contains("Hello, World");

    }
}
