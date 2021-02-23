package assignment3;

import java.util.Random;

public class Executive extends Person{
	private String firstName;
	private String lastName;
	private int age;
	private int SSN;
	private String id;
	private Address address;
	private boolean specialAccommodations;
	private double yearlyPay;
	private String education;
	private boolean directDeposit;
	Executive(){
	}
	Executive(String firstName, String lastName){
		super(firstName, lastName);
	}
	Executive(String firstName, String lastName, int age, int SSN, String id, 
			Address address, boolean specialAccommodations,double yearlyPay,
			String education, boolean directDeposit){
		super(firstName, lastName, age, SSN, id, address, specialAccommodations);
		this.yearlyPay = yearlyPay;
		this.education = education;
		this.directDeposit = directDeposit;
	}
	double getYearlyPay() {
		return yearlyPay;
	}
	void setYearlyPay(double yearlyPay) {
		this.yearlyPay = yearlyPay;
	}
	String getEducation() {
		return education;
	}
	void setEducation(String education){
		this.education = education;
	}
	boolean getDirectDeposit() {
		return directDeposit;
	}
	void setDirectDeposit(boolean directDeposit) {
		this.directDeposit = directDeposit;
	}
	double generateBonus() {
		double rangeMin = 1000;
		double rangeMax = 10000;
		Random r = new Random();
		double randomValue = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
		return randomValue;
	}
	public void computePay() {
		double totalPay;
		totalPay = yearlyPay + generateBonus();
		System.out.println("Getting paid: $" + totalPay+ " a year");
	}
	public String toString() {
		return (getFirstName() + " " + getLastName() +
		"\nTitle: Executive"+
		"\nAge: " + getAge() +
		"\nSSN: " + getSSN() +
		"\nID: "+ getID()+
		"\nNeed special accommodation: "+ getSpecialAccommodations()+
		"\nLevel of education: " + getEducation()+
		"\nDirect deposit: " + getDirectDeposit()+ 
		"\nSalary: "+ getYearlyPay()+ "/yr")+
		"\nAddress " + getAddress().toString();
	}
	public void introduce() {
		System.out.println(toString());
	}
	
}