package io.github.gandrade.greetingservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Slf4j
public class GreetingController {

    @Autowired
    GreetingRepository repository;

    @GetMapping
    public String hi() {
        String s = "Hello World: " + UUID.randomUUID();

        Greeting greeting = Greeting.newBuilder().withName(s).build();
        Greeting save = repository.save(greeting);
        return s;
    }
}
