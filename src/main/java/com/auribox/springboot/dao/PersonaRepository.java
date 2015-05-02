package com.auribox.springboot.dao;

import org.springframework.data.repository.CrudRepository;

import com.auribox.springboot.model.Persona;

/*
* Generando esta interfaz para nuestro Entity, obtenemos métodos con operaciones básicas como CRUD
* http://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/repository/CrudRepository.html
*/
public interface PersonaRepository extends CrudRepository<Persona, Integer> {

}
