package com.devsuperior.dspesquisa.dto;

import java.io.Serializable;
import java.time.Instant;

import com.devsuperior.dspesquisa.entities.Record;

public class RecordDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private Integer age;
	private Instant moment;
	
	public RecordDTO() {
	}

	public RecordDTO(Record entity) {
		id = entity.getId();
		name = entity.getName();
		age = entity.getAge();
		moment = entity.getMoment();
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}
	
}
