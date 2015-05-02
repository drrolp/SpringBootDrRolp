package com.auribox.springboot.dao;

import org.springframework.data.repository.CrudRepository;

import com.auribox.springboot.model.Persona;

public interface PersonaRepository extends CrudRepository<Persona, Integer> {

}
