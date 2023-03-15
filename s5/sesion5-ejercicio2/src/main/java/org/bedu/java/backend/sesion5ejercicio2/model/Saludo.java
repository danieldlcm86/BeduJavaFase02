package org.bedu.java.backend.sesion5ejercicio2.model;

import org.springframework.stereotype.Component;

@Component
public class Saludo {
    private final String nombre;

    public Saludo() {
        this.nombre = "Daniel";
    }

    public String getNombre() {
        return nombre;
    }
}
