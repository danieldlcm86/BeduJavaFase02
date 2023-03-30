package org.bedu.java.backend.sesion8ejercicio1.persistence;

import org.bedu.java.backend.sesion8ejercicio1.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
