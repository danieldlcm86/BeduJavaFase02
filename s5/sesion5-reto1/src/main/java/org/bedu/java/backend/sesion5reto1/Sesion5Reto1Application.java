package org.bedu.java.backend.sesion5reto1;

import org.bedu.java.backend.sesion5reto1.service.SaludoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sesion5Reto1Application implements CommandLineRunner {

	private final SaludoService saludoService;

	public Sesion5Reto1Application(@Autowired SaludoService saludoService) {
		this.saludoService = saludoService;
	}

	public static void main(String[] args) {
		SpringApplication.run(Sesion5Reto1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(saludoService.saluda());
	}
}
