package com.enigma.dev.controller;

import com.enigma.dev.response.User;
import com.enigma.dev.utility.ApiConsumingUsingRestTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class RestTemplateController {
    private final ApiConsumingUsingRestTemplate apiConsumingUsingRestTemplate;

    public RestTemplateController(ApiConsumingUsingRestTemplate apiConsumingUsingRestTemplate) {
        this.apiConsumingUsingRestTemplate = apiConsumingUsingRestTemplate;
    }

    @GetMapping("/restTemplate/get-users")
    public User[] userList(){
        log.info("RestTemplateController :: userList ::");
       return apiConsumingUsingRestTemplate.consumeApiUsingWebClient();
    }
}
