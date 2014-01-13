package com.ascuntar.estudioJPA.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class News {

	@EmbeddedId
	private NewsId id;
	private String content;
	
	public News() {
	}

	public NewsId getId() {
		return id;
	}

	public void setId(NewsId id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public News(String content) {
		super();
		this.content = content;
	}
	
	
	
}
