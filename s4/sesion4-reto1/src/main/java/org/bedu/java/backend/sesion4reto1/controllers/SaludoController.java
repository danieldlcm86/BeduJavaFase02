package org.bedu.java.backend.sesion4reto1.controllers;

import org.bedu.java.backend.sesion4reto1.model.Saludo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

    @GetMapping("/saludo/{nombre}")
    public Saludo saluda(@PathVariable String nombre){
        Saludo saludo = new Saludo();
        saludo.setMensaje("Hola ");
        saludo.setNombre(nombre);

        return saludo;
    }
}
