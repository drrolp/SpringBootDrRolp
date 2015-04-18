package com.auribox.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "persona")    // cambia en nombre por el de la tabla en la db
public class Persona {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)  // indica que es auntogenerada en la base de datos
	private int id;
	
	@Column(name="nombre")
	private String nombre;
	@Column(name="pais")
	private String country;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}
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
