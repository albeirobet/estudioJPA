package com.ascuntar.estudioJPA.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TBL_CLIENTE")
public class Cliente implements Serializable{


	private static final long serialVersionUID = 1551125239633699104L;
	@Id
	@GeneratedValue
	private Long Id;
	private String nombre;
	private String apellido;
	private String numeroTelefono;
	@OneToOne
	@JoinColumn(name="fk_direccion")
	private Direccion direccion;
	
	public Cliente() {
	}

	public Cliente(String nombre, String apellido, String numeroTelefono,
			Direccion direccion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroTelefono = numeroTelefono;
		this.direccion = direccion;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	
	
	
}
