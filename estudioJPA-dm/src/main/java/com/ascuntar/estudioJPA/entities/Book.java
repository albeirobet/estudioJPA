package com.ascuntar.estudioJPA.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "TBL_BOOK")
@NamedQueries({
		@NamedQuery(name = "findAllBooks", query = "SELECT b FROM Book b"),
		@NamedQuery(name = "findBookH2G2", query = "SELECT b FROM Book b WHERE b.title = 'El Resplandor'") })
public class Book implements Serializable {

	private static final long serialVersionUID = -5306922739682983312L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long Id;
	@NotNull
	@Column(name = "TITLE")
	private String title;
	@Column(name = "PRICE")
	private Float price;
	@Size(min = 1, max = 2000)
	@Column(name = "DESCRIPCION")
	private String descripcion;
	@Column(name = "ISBN")
	private String isbn;
	@ElementCollection(fetch = FetchType.LAZY)
	@CollectionTable(name="TBL_TAG")
	@Column(name="VALUE")
	private List<String> tags = new ArrayList<>();
	
	


	public Book() {
	}

	public Book(String title, Float price, String descripcion, String isbn,
			List<String> tags) {
		super();
		this.title = title;
		this.price = price;
		this.descripcion = descripcion;
		this.isbn = isbn;
		this.tags = tags;
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

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}


}
