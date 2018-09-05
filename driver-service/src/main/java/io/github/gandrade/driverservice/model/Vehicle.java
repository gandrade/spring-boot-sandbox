package io.github.gandrade.driverservice.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
class Vehicle {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @OneToOne
    private Manufacturer manufacturer;

    @NotNull
    private String color;

    @NotNull
    private Integer seatCount;

    @Enumerated
    @NotNull
    private EngineType engineType;

    private Vehicle(Manufacturer manufacturer, String color, Integer seatCount, EngineType engineType) {
        this.manufacturer = manufacturer;
        this.color = color;
        this.seatCount = seatCount;
        this.engineType = engineType;
    }

    enum EngineType {
        GAS, ELETRIC, HYBRID
    }

    public static class VehicleBuilder {

        private Manufacturer manufacturer;
        private String color;
        private Integer seatCount;
        private EngineType engineType;

        public VehicleBuilder withManufacturer(Manufacturer manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }

        public VehicleBuilder withColor(String color) {
            this.color = color;
            return this;
        }

        public VehicleBuilder withSeatCount(Integer seatCount) {
            this.seatCount = seatCount;
            return this;
        }

        public Vehicle build() {
            return new Vehicle(manufacturer, color, seatCount, engineType);
        }

    }
}
