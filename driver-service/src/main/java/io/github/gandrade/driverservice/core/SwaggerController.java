package io.github.gandrade.driverservice.core;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SwaggerController {

    @GetMapping("/")
    public String swagger() {
        return "redirect:swagger-ui.html";
    }
}
