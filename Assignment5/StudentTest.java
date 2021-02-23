package exercise4;

public class StudentTest {

	public static void main(String[] args) {
		Student student1 = new Student("John", "Smith", 3.6, 20, "Computer Science", "School of Computer Science departmen" );
		Student student2 = null;
		try {
			student2 = (Student) student1.clone();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		student1.printInfo();
		System.out.println("");
		student2.printInfo();
	}

}
