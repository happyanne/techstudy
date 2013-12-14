package com.imsizon.classloader.test;

public class XmlObject {

	private Integer id;
	private String name;
	private StringBuilder description;

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

	public StringBuilder getDescription() {
		return description;
	}

	public void setDescription(StringBuilder description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "XmlObject [id=" + id + ", name=" + name + ", description="
				+ description + "]";
	}

}
