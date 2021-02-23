package assignment3;

public class FullTimeHourly extends Person{
	private String firstName;
	private String lastName;
	private int age;
	private int SSN;
	private String id;
	private Address address;
	private boolean specialAccommodations;
	private double hourlyPay;
	private String education;
	private boolean directDeposit;
	FullTimeHourly(){
	}
	FullTimeHourly(String firstName, String lastName){
		super(firstName, lastName);
	}
	FullTimeHourly(String firstName, String lastName, int age, int SSN, String id, 
			Address address, boolean specialAccommodations, double hourlyPay,
			String education, boolean directDeposit){
		super(firstName, lastName, age, SSN, id, address, specialAccommodations);
		this.hourlyPay = hourlyPay;
		this.education = education;
		this.directDeposit = directDeposit;
	}

	double getHourlyPay() {
		return hourlyPay;
	}
	void setHourlyPay(double hourlyPay) {
		this.hourlyPay = hourlyPay;
	}
	double calculateOtPay(double hour) {
		return hour*hourlyPay*1.5;
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
	public void computePay(double hour) {
		double ot;
		double otPay;
		double totalPay;
		if(hour>40) {
			ot = hour-40;
			otPay = calculateOtPay(ot);
			totalPay = 40 * hourlyPay + otPay;
		}
		else {
			totalPay=hour * hourlyPay;
		}
		System.out.println("Getting paid: $" + totalPay + " for "+ hour+ " hours");
	}
	public String toString() {
		return (getFirstName() + " " + getLastName() +
		"\nTitle: Full Time Hourly Pay Worker"+
		"\nAge: " + getAge() +
		"\nSSN: " + getSSN() +
		"\nID: "+ getID()+
		"\nNeed special accommodation: "+ getSpecialAccommodations()+
		"\nLevel of education: " + getEducation()+
		"\nDirect deposit: " + getDirectDeposit()+ 
		"\nSalary: "+ getHourlyPay()+ "/hr"+	
		"\nAddress " + getAddress().toString());
	}
	public void introduce() {
		System.out.println(toString());
	}
}

