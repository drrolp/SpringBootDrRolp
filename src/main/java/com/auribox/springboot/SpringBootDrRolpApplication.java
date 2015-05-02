package com.auribox.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.auribox.springboot.dao.PersonaRepository;
import com.auribox.springboot.model.Persona;

@SpringBootApplication
public class SpringBootDrRolpApplication implements CommandLineRunner {
	
	@Autowired
	PersonaRepository personaRepository;
	
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDrRolpApplication.class, args);
    }

	/*
	* implementando CommandLineRunner podemos agregar contenido al método run
	* en nuestro caso lo usamos para persistir algunos obtetos al arrancar el programa
	*/
	@Override
	public void run(String... arg0) throws Exception {

		Persona persona = new Persona();
		persona.setNombre("Pedro");
		persona.setCountry("MX");
		personaRepository.save(persona);
	}
}
