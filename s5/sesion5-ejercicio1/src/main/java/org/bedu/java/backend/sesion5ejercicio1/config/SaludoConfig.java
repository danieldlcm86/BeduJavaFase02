package org.bedu.java.backend.sesion5ejercicio1.config;

import org.bedu.java.backend.sesion5ejercicio1.model.Saludo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SaludoConfig {

    @Bean
    public Saludo saludo(){
        return new Saludo("Daniel");
    }
}
