package com.enigma.dev.utility;

import com.enigma.dev.response.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Component
public class ApiConsumingUsingRestTemplate {
    public final RestTemplate restTemplate;

    public ApiConsumingUsingRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public User[] consumeApiUsingWebClient() {
        String url = "https://api.github.com/users";
        User[] users = restTemplate.getForObject(url, User[].class);
        log.info("ApiConsumingUsingRestTemplate :: consumeApiUsingRestTemplate :: users :: {}", users);
        for (User user : users) {
            log.info("ApiConsumingUsingRestTemplate :: consumeApiUsingWebClient ::  user :: id :: {}", user.getId());
        }
        return users;
    }
}
