package org.bedu.java.backend.sesion8Reto1.persistence;

import org.bedu.java.backend.sesion8Reto1.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository <Producto, Long> {
}
