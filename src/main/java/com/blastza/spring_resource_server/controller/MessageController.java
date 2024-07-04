package com.blastza.spring_resource_server.controller;

import com.blastza.spring_resource_server.service.GreetingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class MessageController {

    private final GreetingService greetingService;

    @GetMapping("/")
    @ResponseBody
    public Map<String, String> hello(){
        return greetingService.greet();
    }
}
