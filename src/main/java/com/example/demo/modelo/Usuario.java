package com.example.demo.modelo;

public class Usuario 
{
	private long  id;
	private String nombre;
	private int edad;	
	
	public Usuario(String nombre, int edad, long id) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
