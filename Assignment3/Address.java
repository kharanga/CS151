package assignment3;

public class Address {
	private int number;
	private String street;
	private String city;
	private String state;
	private int zip;
	private String country;
	Address(int number, String street, String city, String state, int zip, String country){
		this.number = number;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}
	int getNumber() {
		return number;
	}
	void setNumber(int number) {
		this.number = number;
	}
	String getStreet() {
		return street;
	}
	void setStreet(String street) {
		this.street = street;
	}
	String getCity() {
		return city;
	}
	void setCity(String city) {
		this.city = city;
	}
	String getState() {
		return state;
	}
	void setState(String state) {
		this.state = state;
	}
	int getZip() {
		return zip;
	}
	void setZip(int zip) {
		this.zip = zip;
	}
	String getCountry() {
		return country;
	}
	void setCountry(String country) {
		this.country = country;
	}
	public String toString() {
		return getNumber() + " " + getStreet() + ", " + getCity() + ", " + getState()
				+ ", " + getZip() + ", " + getCountry();
	}
}
