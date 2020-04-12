package com.sachin.restws.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Patient")
public class Patient {

	private Integer id;
	private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
