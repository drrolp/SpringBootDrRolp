package com.auribox.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.auribox.springboot.dao.PersonaRepository;
import com.auribox.springboot.model.Persona;

@Controller
public class DrRolpController {
	
	@Autowired
	PersonaRepository personaRepository;

	@RequestMapping
	public String index(){
		return "index";
	}
	
	@RequestMapping("/dos")
	public String saludados(@RequestParam(value="nombre", defaultValue="mundo") String nombre,Model model){
		model.addAttribute("name",nombre);
		return "saluda";
	}
	
	@RequestMapping("/list")
	public String list(Model model){
		model.addAttribute("name",personaRepository.findAll());
		return "saluda";
	}
	@RequestMapping("/save")
	public String save(Model model){
		Persona persona1 = new Persona();
		persona1.setNombre("Pedro");
		persona1.setCountry("MX");
		personaRepository.save(persona1);
		Persona persona2 = new Persona();
		persona2.setNombre("Israel");
		persona2.setCountry("FR");
		personaRepository.save(persona2);
		Persona persona3 = new Persona();
		persona3.setNombre("Ethien");
		persona3.setCountry("EU");
		personaRepository.save(persona3);
		Persona persona4 = new Persona();
		persona4.setNombre("Estela");
		persona4.setCountry("AF");
		personaRepository.save(persona4);

		model.addAttribute("name","saved!!");
		return "saluda";
	}
	
	@RequestMapping("/find")
	public String find(@RequestParam(value="id", defaultValue="1") int id, Model model){
		model.addAttribute("name",personaRepository.findOne(id));
		return "saluda";
	}
}
