package com.enigma.dev;

import com.enigma.dev.utility.ApiConsumingUsingRestTemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestApiCosumingApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApiCosumingApplication.class, args);
    }

}
