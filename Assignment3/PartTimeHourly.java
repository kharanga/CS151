package assignment3;

public class PartTimeHourly extends Person{
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
	PartTimeHourly(){
	}
	PartTimeHourly(String firstName, String lastName){
		super(firstName, lastName);
	}
	PartTimeHourly(String firstName, String lastName, int age, int SSN, String id, 
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
		if(hour<40) {
			double totalPay = hourlyPay * hour; 
			System.out.println ("Getting paid: $" + totalPay + " for "+ hour+ " hours");
			return;
		}
		System.out.println("Error, exceeding the work time limit");
	}
	public String toString() {
		return (getFirstName() + " " + getLastName() +
		"\nTitle: Part Time Hourly Pay Worker"+
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

