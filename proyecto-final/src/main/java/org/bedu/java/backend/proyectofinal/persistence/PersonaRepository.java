package org.bedu.java.backend.proyectofinal.persistence;


import org.bedu.java.backend.proyectofinal.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
