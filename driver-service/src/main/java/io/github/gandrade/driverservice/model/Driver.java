package io.github.gandrade.driverservice.model;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
class Driver {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    private LocalDate birthDate;

    private Driver(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public static class DriverBuilder {
        private String firstName;
        private String lastName;
        private LocalDate birthDate;

        public DriverBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public DriverBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public DriverBuilder withBirthDate(LocalDate birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public Driver build() {
            return new Driver(firstName, lastName, birthDate);
        }
    }
}
