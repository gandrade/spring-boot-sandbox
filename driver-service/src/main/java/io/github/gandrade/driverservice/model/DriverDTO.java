package io.github.gandrade.driverservice.model;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Setter
@ToString
public class DriverDTO {

    private String firstName;
    private String lastName;
    private LocalDate birthDate;
}
