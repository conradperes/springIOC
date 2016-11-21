package br.com.jm.spring.ioc.beans;

public class Address {
	
	private String street;
	private int number;
	
	private Zip zip;
	private String city;
	private States state;
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public States getState() {
		return state;
	}
	public void setState(States state) {
		this.state = state;
	}
	public Zip getZip() {
		return zip;
	}
	public void setZip(Zip zip) {
		this.zip = zip;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", number=" + number + ", zip=" + zip + ", city=" + city + ", state="
				+ state + "]";
	}
	

}
