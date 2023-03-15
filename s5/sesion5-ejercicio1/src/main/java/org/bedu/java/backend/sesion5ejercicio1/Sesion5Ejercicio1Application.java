package org.bedu.java.backend.sesion5ejercicio1;

import org.bedu.java.backend.sesion5ejercicio1.model.Saludo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sesion5Ejercicio1Application implements CommandLineRunner {
	private Saludo saludo;

	public static void main(String[] args) {
		SpringApplication.run(Sesion5Ejercicio1Application.class, args);}

	@Override
	public void run (String...args) throws Exception {
		System.out.println(saludo.getNombre());
	}

	@Autowired
	public Sesion5Ejercicio1Application(Saludo saludo) {
			this.saludo = saludo;
		}

}
