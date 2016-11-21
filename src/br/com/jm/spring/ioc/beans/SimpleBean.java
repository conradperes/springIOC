package br.com.jm.spring.ioc.beans;

import static br.com.jm.spring.ioc.utils.PrintUtils.print;

public class SimpleBean {

	public SimpleBean() {
		print("Bean " + this.getClass() + " created");
	}

	private String simpleProperty;

	public void setSimpleProperty(String simpleProperty) {
		this.simpleProperty = simpleProperty;
	}

	public String getSimpleProperty() {
		return simpleProperty;
	}

}
