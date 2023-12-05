package com.ipartek.modelo;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tipos")
public class Tipo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	@Column(name="tipo")
	private String tipo;
	
	
	@OneToMany
	private List <Juguete> listajuguetes=new ArrayList<Juguete>();


	public Tipo(int id, String tipo, List<Juguete> listajuguetes) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.listajuguetes = listajuguetes;
	}


	public Tipo() {
		super();
		this.id = 0;
		this.tipo = "";
		this.listajuguetes = new ArrayList<Juguete>();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public List<Juguete> getListajuguetes() {
		return listajuguetes;
	}


	public void setListajuguetes(List<Juguete> listajuguetes) {
		this.listajuguetes = listajuguetes;
	}


	@Override
	public String toString() {
		return "Tipo [id=" + id + ", tipo=" + tipo + ", listajuguetes=" + listajuguetes + "]";
	}
	
	
	
	
	
	
	
	

}
