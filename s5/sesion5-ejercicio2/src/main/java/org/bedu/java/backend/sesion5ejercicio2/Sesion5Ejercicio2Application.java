package org.bedu.java.backend.sesion5ejercicio2;

import org.bedu.java.backend.sesion5ejercicio2.service.SaludoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sesion5Ejercicio2Application implements CommandLineRunner {
	private final SaludoService saludoService;

	public Sesion5Ejercicio2Application(@Autowired SaludoService saludoService) {
		this.saludoService = saludoService;
	}

	public static void main(String[] args) {
		SpringApplication.run(Sesion5Ejercicio2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(saludoService.saluda());
	}
}
