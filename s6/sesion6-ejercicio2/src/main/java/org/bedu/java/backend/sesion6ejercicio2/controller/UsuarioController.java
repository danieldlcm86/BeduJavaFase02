package org.bedu.java.backend.sesion6ejercicio2.controller;

import org.bedu.java.backend.sesion6ejercicio2.model.Direccion;
import org.bedu.java.backend.sesion6ejercicio2.model.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioController {
    @PostMapping
    public ResponseEntity<Usuario> creaUsuario(@RequestBody Usuario usuario){
        System.out.println("Creando usuario");
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Apellido: " + usuario.getApellido());
        System.out.println("Usuario: " + usuario.getUsuario());
        System.out.println("E-Mail: " + usuario.getCorreoElectronico());

        Direccion direccion = new Direccion();
        direccion.setCalle("Pelicano");
        direccion.setNumero("113");
        direccion.setCodigoPostal("86284");

        usuario.setDireccion(direccion);

        return ResponseEntity.ok(usuario);
    }

}
