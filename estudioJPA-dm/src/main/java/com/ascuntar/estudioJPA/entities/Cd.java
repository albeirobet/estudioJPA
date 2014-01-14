package com.ascuntar.estudioJPA.entities;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MapKeyColumn;


@Entity
public class Cd {

	@Id
	@GeneratedValue
	@Column(name="ID")
	private Long Id;
	@Column(name="TITLE")
	private String title;
	@Column(name="DESCRIPCION")
	private String descripcion;
	@ElementCollection
	@CollectionTable(name="TBL_TRACKS")
	@MapKeyColumn(name="POSITION")
	@Column(name="TITLE")
	private Map<Integer, String> tracks= new HashMap<>();
	
	
	public Cd() {
	}


	public Cd(String title, String descripcion, Map<Integer, String> tracks) {
		super();
		this.title = title;
		this.descripcion = descripcion;
		this.tracks = tracks;
	}


	public Long getId() {
		return Id;
	}


	public void setId(Long id) {
		Id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Map<Integer, String> getTracks() {
		return tracks;
	}


	public void setTracks(Map<Integer, String> tracks) {
		this.tracks = tracks;
	}
	
	
}
