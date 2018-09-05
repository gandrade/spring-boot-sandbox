package io.github.gandrade.driverservice.query;

import io.github.gandrade.driverservice.model.DriverDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api/drivers")
public class DriverQueryController {

    @GetMapping
    public Collection<DriverDTO> findAllDrivers(){
        return null;
    }

    public DriverDTO findDriver(DriverDTO driverDTO){
        return null;
    }
}
