package assignment3;

public class Customer extends Person{
	private String firstName;
	private String lastName;
	private int age;
	private int SSN;
	private String id;
	private String paymentMethod;
	private Address address;
	private boolean specialAccommodations;
	Customer(){
	}
	Customer(String firstName, String lastName){
		super(firstName, lastName);
	}
	Customer(String firstName, String lastName, int age, int SSN, String id, 
			String paymentMethod, Address address, boolean specialAccommodations){
		super(firstName, lastName, age, SSN, id, address, specialAccommodations);
		this.paymentMethod = paymentMethod;
	}
	String getPaymentMethod() {
		return paymentMethod;
	}
	void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	void makePayment() {
		System.out.println("Making payment with "+ getPaymentMethod());
	}
	public String toString() {
		return (getFirstName() + " " + getLastName() +
		"\nTitle: Executive"+
		"\nAge: " + getAge() +
		"\nSSN: " + getSSN() +
		"\nID: "+ getID()+
		"\nNeed special accommodation: "+ getSpecialAccommodations()+
		"\nPayment method: "+ getPaymentMethod()+
		"\nAddress " + getAddress().toString());
	}
	public void introduce() {
		System.out.println(toString());
	}
	
}
