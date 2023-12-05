package com.ipartek.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="juguetes")
public class Juguete {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "precio")
	private double precio;
	
	@ManyToOne
	private Tipo tipo;

	public Juguete(int id, String nombre, double precio, Tipo tipo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.tipo = tipo;
	}

	public Juguete() {
		super();
		this.id = 0;
		this.nombre = "";
		this.precio = 0.0;
		this.tipo = new Tipo();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Juguete [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", tipo=" + tipo + "]";
	}
	
	
	
	
	
	
}
