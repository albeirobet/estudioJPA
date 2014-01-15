package com.ascuntar.estudioJPA.herencia;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Id;


@Entity
@Table(name="TBL_ITEM1")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="DISC", discriminatorType= DiscriminatorType.CHAR)
@DiscriminatorValue("I")
public class Item1  implements Serializable{
	
	private static final long serialVersionUID = 3365515122678638792L;
	@Id
	@GeneratedValue
	protected Long Id;
	protected String title;
	protected Float price;
	protected String description;
	
	public Item1() {
	}

	public Item1(String title, Float price, String description) {
		super();
		this.title = title;
		this.price = price;
		this.description = description;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
