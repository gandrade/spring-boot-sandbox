package io.github.gandrade.driverservice.driver.repository;

import io.github.gandrade.driverservice.driver.Driver;
import org.springframework.data.repository.CrudRepository;

public interface DriverRepository extends CrudRepository<Driver, Long> {
}
