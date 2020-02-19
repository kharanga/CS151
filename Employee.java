package assignment2;

public class Employee extends Person{
	private String id;
	private String status;
	private String startDate;
	private double hourlyPay;
	private double yearlySalary;
	public Employee(String firstName, String lastName, double weight, int age, String SSN, String gender,
					String id, String status,String startDate, double pay) {
		super(firstName, lastName, weight, age, SSN, gender);
		this.id = id;
		this.status = status;
		this.startDate = startDate;
		if(status.equals("full time"))
			this.yearlySalary = pay;
		else
			this.hourlyPay = pay;
	}
	String getId() {
		return id;
	}
	void setId(String id) {
		this.id = id; 
	}
	String getStatus() {
		return status;
	}
	void setStatus(String status) {
		this.status = status;
	}
	String getStartDate() {
		return startDate;
	}
	void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	double getHourlyPay() {
		return hourlyPay;
	}
	void setHourlyPay(double hourlyPay) {
		this.hourlyPay = hourlyPay;
	}
	double getYearlySalary() {
		return yearlySalary;
	}
	void setYearlySalary(double yearlySalary) {
		this.yearlySalary = yearlySalary;
	}
	void introduce() {
		System.out.println("ID: " + getId());
		System.out.println("Status: "+ getStatus());
		System.out.println("Start date: "+ getStartDate());
		if(getStatus().equals("full time"))
			System.out.println("Yearly salary: "+ getYearlySalary());
		else
			System.out.println("Hourly pay: "+ getHourlyPay());
	}
	void display() {
		super.introduce();
		this.introduce();
	}
	void calculatePay(double time) {
		System.out.println(getFirstName()+" "+ getLastName()+", " + getStatus());
		if(getStatus().equals("full time"))
			System.out.print("Pay is $"+ getYearlySalary() +"/yr , should get paid for working " + time +" week");
		else
			System.out.print("Pay is $"+ getHourlyPay() +"/hr , should get paid for working " + time +" hours");
		System.out.println();
	}
	
	
}
