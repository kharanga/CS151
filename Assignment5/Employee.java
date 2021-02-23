package exercise5;

public class Employee {
	private String firstName;
	private String lastName;
	private String id;
	private double hourlyPay;
	Employee(String firstName, String lastName, String id, double hourlyPay){
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.hourlyPay = hourlyPay;
	}
	
	String getFirstName() {return firstName;}
	String getLastName() {return lastName;}
	String getID() {return id;}
	double getHourlyPay() {return hourlyPay;}
	
	void setFirstName(String firstName) {this.firstName = firstName;}
	void setLastName(String lastName) {this.lastName = lastName;}
	void setID(String id) {this.id = id;}
	void setHourlyPay(double hourlyPay) {this.hourlyPay = hourlyPay;}
	
	double computePay(double hour) {
		double totalPay = 0;
		try {
			if(hour<0) throw new NumberFormatException("Your hours can not be a negative number");
			
			else if(hour>40) throw new TooManyHoursWorkedException("Your hours can not be over 40");
			
			else totalPay = getHourlyPay()*hour;
		} catch (NumberFormatException e) {
			System.out.println(e);
		} catch (TooManyHoursWorkedException e) {
			System.out.println(e);
		}
		return totalPay;
		
	}
}
