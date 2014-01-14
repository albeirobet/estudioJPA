package com.ascuntar.estudioJPA.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * @author Eyder Albeiro Ascuntar Rosales
 */

@Entity
@Table(name = "TBL_PRUEBA")
public class Prueba implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2231965550492253340L;
	@Id
	@GeneratedValue
	@Column(name="ID")
	private long Id;
	@Column(name="FIRSTNAME")
	private String firstname;
	@Column(name="SURNAME")
	private String surname;

	public Prueba() {
	}

	public Prueba(String firstname, String surname) {
		super();
		this.firstname = firstname;
		this.surname = surname;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}
