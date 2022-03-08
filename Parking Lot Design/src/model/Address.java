package model;


public class Address {
	
	private String street;
	private String block;
	private String city;
	private String state;
	private String country;
  
	public String getStreet() {
		return street;
	}
	public Address setStreet(String street) {
		this.street = street;
		return this;
	}
	public String getBlock() {
		return block;
	}
	public Address setBlock(String block) {
		this.block = block;
		return this;
	}
	public String getCity() {
		return city;
	}
	public Address setCity(String city) {
		this.city = city;
		return this;
	}
	public String getState() {
		return state;
	}
	public Address setState(String state) {
		this.state = state;
		return this;
	}
	public String getCountry() {
		return country;
	}
	public Address setCountry(String country) {
		this.country = country;
		return this;
	}
}
