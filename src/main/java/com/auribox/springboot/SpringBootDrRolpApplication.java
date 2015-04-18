package com.auribox.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.auribox.springboot.dao.PersonaRepositoy;
import com.auribox.springboot.model.Persona;

@SpringBootApplication
public class SpringBootDrRolpApplication implements CommandLineRunner {
	
	@Autowired
	PersonaRepositoy personaRepository;
	
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDrRolpApplication.class, args);
    }

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		Persona persona = new Persona();
		persona.setNombre("Pedro");
		persona.setCountry("MX");
		personaRepository.save(persona);
	}
}
