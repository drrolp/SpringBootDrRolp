package com.auribox.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
/*
* Por defecto el nombre de la tabla es el nombre de la entidad,
* en caso de querer cambiarlo usamos la anotación @Table
*/
@Table(name = "persona")
public class Persona {

	@Id		// Toda entidad necesita tener su llave primaria que la identifique de manera única en la BD - http://docs.oracle.com/javaee/7/api/javax/persistence/Id.html
	@GeneratedValue(strategy=GenerationType.IDENTITY)  // Definimos la estratégia para generar el ID - http://docs.oracle.com/javaee/7/api/javax/persistence/GenerationType.html
	private int id;

	@Column(name="nombre")
	private String nombre;
	/*
	* Por defecto el nombre de la columna es el mismo que del atributo,
	* en caso de querer cambiarlo usamos la anotación @Column
	* en este ejemplo el atributo "country" mapea a la columna "pais"
	*/
	@Column(name="pais")
	private String country;
	
	public Persona() {}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", country="
				+ country + "]";
	}
	
	
}
