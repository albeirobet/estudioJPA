package com.ascuntar.estudioJPA.herencia;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="TBL_CD1")
@DiscriminatorValue("C")
public class CD1  extends Item1{
	
	private static final long serialVersionUID = -6378180232760722749L;
	private String musicCompany;
	private Integer numberOfCDs;
	private Float totalDuration;
	private String genre;
	
	public CD1() {
	}

	public CD1(String musicCompany, Integer numberOfCDs, Float totalDuration,
			String genre) {
		super();
		this.musicCompany = musicCompany;
		this.numberOfCDs = numberOfCDs;
		this.totalDuration = totalDuration;
		this.genre = genre;
	}

	public String getMusicCompany() {
		return musicCompany;
	}

	public void setMusicCompany(String musicCompany) {
		this.musicCompany = musicCompany;
	}

	public Integer getNumberOfCDs() {
		return numberOfCDs;
	}

	public void setNumberOfCDs(Integer numberOfCDs) {
		this.numberOfCDs = numberOfCDs;
	}

	public Float getTotalDuration() {
		return totalDuration;
	}

	public void setTotalDuration(Float totalDuration) {
		this.totalDuration = totalDuration;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	

}
