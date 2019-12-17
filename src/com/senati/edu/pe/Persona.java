package com.senati.edu.pe;

public class Persona {
	
	public String dni;
	public String nombre;
	public String apellido;
	public char sexo;
	public int edad;

	public Persona(String dni, String nombre, String apellido, char sexo, int edad) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.edad = edad;
	}	

	public Persona() {
		this.dni = "-------------";
		this.nombre = "-------------";
		this.apellido = "-------------";
		this.sexo = '-';
		this.edad = 0;
	}
		
	public Persona(Persona p) {
		this.dni = p.dni;
		this.nombre = p.nombre;
		this.apellido = p.apellido;
		this.sexo = p.sexo;
		this.edad = p.edad;
	}
	
	@Override
	public String toString() {
	return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo + ", edad="+ edad + "]";
	}

}
