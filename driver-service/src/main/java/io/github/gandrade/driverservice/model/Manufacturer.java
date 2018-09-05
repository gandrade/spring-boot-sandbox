package io.github.gandrade.driverservice.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
class Manufacturer {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String name;

    private Manufacturer(String name) {
        this.name = name;
    }

    public class ManufacturerBuilder {
        private String name;

        public ManufacturerBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public Manufacturer build() {
            return new Manufacturer(name);
        }
    }
}
