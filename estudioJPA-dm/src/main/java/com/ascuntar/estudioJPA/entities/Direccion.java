package com.ascuntar.estudioJPA.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TBL_DIRECCION")
public class Direccion {

	@Id
	@GeneratedValue
	private Long Id;
	private String calle;
	private String barrio;
	private String ciudad;
	private String estado;
	private String pais;
	@OneToOne(mappedBy="direccion")	
	private Cliente cliente;
	
	public Direccion() {
	}

	public Direccion(String calle, String barrio, String ciudad, String estado,
			String pais, Cliente cliente) {
		super();
		this.calle = calle;
		this.barrio = barrio;
		this.ciudad = ciudad;
		this.estado = estado;
		this.pais = pais;
		this.cliente = cliente;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getBarrio() {
		return barrio;
	}

	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
}
