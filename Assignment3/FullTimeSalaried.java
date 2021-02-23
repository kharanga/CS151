package assignment3;

public class FullTimeSalaried extends Person {
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
	FullTimeSalaried(){
	}
	FullTimeSalaried(String firstName, String lastName){
		super(firstName, lastName);
	}
	FullTimeSalaried(String firstName, String lastName, int age, int SSN, String id, 
					Address address, boolean specialAccommodations, double yearlyPay,
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
	public void computePay(double week) {
		System.out.println("Getting paid: $" +yearlyPay + " for "+ week+ " weeks");
	}
	public String toString() {
		return (getFirstName() + " " + getLastName() +
		"\nTitle: Full Time Salary Worker"+
		"\nAge: " + getAge() +
		"\nSSN: " + getSSN() +
		"\nID: "+ getID()+
		"\nNeed special accommodation: "+ getSpecialAccommodations()+
		"\nLevel of education: " + getEducation()+
		"\nDirect deposit: " + getDirectDeposit()+ 
		"\nSalary: "+ getYearlyPay()+ "/yr"+
		"\nAddress " + getAddress().toString());
	}
	public void display() {
		System.out.println(toString());
	}
}
