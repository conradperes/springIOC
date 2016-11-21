package br.com.jm.spring.ioc.beans;

import java.util.List;
import java.util.Map;

public class Person {
	private String name;
	private int age;
	private List<String> hobbies;
	private Map<String, String> mapa;
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Map<String, String> getMapa() {
		return mapa;
	}

	public void setMapa(Map<String, String> mapa) {
		this.mapa = mapa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ",\n hobbies=" + hobbies + ", mapa=" + mapa + ",\n address="
				+ address + "]";
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	public static Person newInstance(String name){
		Person person = new Person();
		person.setName(name);
		return person;
	}
}
