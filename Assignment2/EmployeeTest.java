package assignment2;

public class EmployeeTest {
	public static void main(String[]args) {
		Employee employee = new Employee("John", "Nguyen", 135, 20, "1000000", "male",
										"10101011", "part time", "11/15/2010", 65.5);		
		employee.display();
		employee.calculatePay(60);
	}
}
