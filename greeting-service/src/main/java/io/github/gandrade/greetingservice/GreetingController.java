package io.github.gandrade.greetingservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Slf4j
public class GreetingController {

    @GetMapping
    public String hi(){
        log.info("Calling hi endpoint");
        return "Hello World " + UUID.randomUUID();
    }
}
