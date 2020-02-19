package assignment2;

public class StudentTest {
	public static void main(String[]args) {
		Student student = new Student("John", "Smith", 3.6, 20, "Computer Science", "School of Computer Science departmen" );
		Student.Course course = student.new Course();
		course.printSchedule();
	}
}
