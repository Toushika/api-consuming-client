package com.enigma.dev.utility;

import com.enigma.dev.response.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Slf4j
@Component
public class ApiConsumingUsingWebClient {
    private final WebClient webClient;

    public ApiConsumingUsingWebClient(WebClient webClient) {
        this.webClient = webClient;
    }

    public User[] consumeApiUsingWebClient() {
        String url = "https://api.github.com/users";
        User[] users = webClient.get()
                .uri(url)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(User[].class)
                .block();
        for (User user : users) {
            log.info("ApiConsumingUsingWebClient :: consumeApiUsingWebClient ::  user ::  id :: {}", user.getId());
        }
        return users;
    }
}

