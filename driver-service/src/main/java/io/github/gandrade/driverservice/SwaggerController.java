package io.github.gandrade.driverservice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SwaggerController {

    @GetMapping("/")
    public String swagger() {
        return "swagger-ui.html";
    }
}
