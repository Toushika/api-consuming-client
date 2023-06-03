package com.enigma.dev.controller;

import com.enigma.dev.response.User;
import com.enigma.dev.utility.ApiConsumingUsingWebClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class WebClientController {
    private final ApiConsumingUsingWebClient apiConsumingUsingWebClient;

    public WebClientController(ApiConsumingUsingWebClient apiConsumingUsingWebClient) {
        this.apiConsumingUsingWebClient = apiConsumingUsingWebClient;
    }

    @GetMapping("/webclient/get-users")
    public User[] userList() {
        log.info("WebClientController :: userList ::");
        return apiConsumingUsingWebClient.consumeApiUsingWebClient();
    }
}
