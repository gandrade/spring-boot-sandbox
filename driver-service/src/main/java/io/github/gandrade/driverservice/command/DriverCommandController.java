package io.github.gandrade.driverservice.command;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/drivers")
public class DriverCommandController {

    @PutMapping("/{driverId}")
    public void updateLocation(@PathVariable String driverId) {

    }
}
