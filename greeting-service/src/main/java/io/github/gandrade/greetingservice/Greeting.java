package io.github.gandrade.greetingservice;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
class Greeting {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private Greeting() {
    }

    private Greeting(String name) {
        this.name = name;
    }

    public static GreetingBuilder newBuilder()
    {
        return new GreetingBuilder();
    }

    static class GreetingBuilder {
        private String name;

        public GreetingBuilder withName(String name){
            this.name = name;
            return this;
        }

        public Greeting build(){
            return new Greeting(name);
        }
    }
}
