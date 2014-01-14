package com.ascuntar.estudioJPA.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;


@Entity
@SecondaryTables({
	@SecondaryTable(name="TBL_CITY"),
	@SecondaryTable(name="TBL_COUNTRY")
})
public class Address implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8527293226463926971L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private Long Id;
	@Column(name="STREET1")
	private String street1;
	@Column(name="STREET2")
	private String street2;
	@Column(name="CITY",table="TBL_CITY")
	private String city;
	@Column(name="ESTATE",table="TBL_CITY")
	private String state;
	@Column(name="ZIPCODE",table="TBL_CITY")
	private String zipcode;
	@Column(name="COUNTRY",table="TBL_COUNTRY")
	private String country;
	
	public Address() {
	}

	public Address(String street1, String street2, String city, String state,
			String zipcode, String country) {
		super();
		this.street1 = street1;
		this.street2 = street2;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.country = country;
	}

	public String getStreet1() {
		return street1;
	}

	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	public String getStreet2() {
		return street2;
	}

	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	
}
