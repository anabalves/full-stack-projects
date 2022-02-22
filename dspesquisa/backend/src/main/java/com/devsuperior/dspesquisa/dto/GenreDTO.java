package com.devsuperior.dspesquisa.dto;

import java.io.Serializable;

import com.devsuperior.dspesquisa.entities.Genre;

public class GenreDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	
	public GenreDTO() {
	}

	public GenreDTO(Genre entity) {
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
