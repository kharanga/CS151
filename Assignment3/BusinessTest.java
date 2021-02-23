package assignment3;

public class BusinessTest {
	public static void main(String[]args) {
		Address add1 = new Address (111, "Khy Street", "San Jose", "CA", 95133, "USA");
		Address add2 = new Address (111, "Hy Drive", "Denver", "CO", 95123, "USA");
		Address add3 = new Address (111, "Khddy St", "Ajhds", "Quebec", 010101, "CANADA");
		Address add4 = new Address (111, "SantaC Street", "Santa Clara", "CA", 95132, "USA");
		Address add5 = new Address (111, "Story Ave", "San Jose", "CA", 95233, "USA");
		Address add6 = new Address (111, "King Street", "San Jose", "CA", 95663, "USA");
		Address add7 = new Address (111, "Adasa Street", "Milpitas", "CA", 94152, "USA");
		Address add8 = new Address (111, "Pasotr Drive", "New York City", "NY", 12333, "USA");
		Address add9 = new Address (111, "Asdae Street", "Philly", "MA", 05133, "USA");
		Address add10 = new Address (111, "Khdddy Ct", "Boston", "MA", 94323, "USA");
		Address add11 = new Address (111, "Khsdsay Dr", "San Jose", "CA", 95133, "USA");
		Address add12 = new Address (111, "Kbcsad St", "San Jose", "CA", 95133, "USA");
		Executive exe1 = new Executive("Khang", "Nguyen", 19, 111111, "1AAAAAA", 
				add1, true,100000.0,
				"college", false);
		Executive exe2 = new Executive("Hang", "Perez", 25, 111112, "1AAAAAB", 
				add2, false,75000.0,
				"high school", false);
		PartTimeHourly pth1 = new PartTimeHourly("Melia", "Santa", 75, 111113, "1AAAAAC", 
				add3, true,15.5,
				"master degree", true);
		PartTimeHourly pth2 = new PartTimeHourly("Naruto", "Uzumaki", 39, 111114, "1AAAAAD", 
				add4, false,25.5,
				"middle school", true);
		FullTimeHourly fth1 = new FullTimeHourly("Hinata", "Neji", 50, 111115, "1AAAAAE", 
				add5, false,16.7,
				"college", false);
		FullTimeHourly fth2 = new FullTimeHourly("Jonathan", "Joestar", 70, 111116, "1AAAAAF", 
				add6, false,15.0,
				"college", false);
		ContractorHourly ch1 = new ContractorHourly("Johnny", "Joestar", 55, 111117, "1AAAAAG", 
				add7, true,20.5,
				"PHD", false);
		ContractorHourly ch2 = new ContractorHourly("Robert", "Speedwagon", 22, 111118, "1AAAAAH", 
				add8, true,75.0,
				"college", true);
		FullTimeSalaried fts1 = new FullTimeSalaried("John", "Wick", 18, 111119, "1AAAAAI", 
				add9, false,100000.0,
				"some high school", true);
		FullTimeSalaried fts2 = new FullTimeSalaried("Kharanga", "Azul", 34, 111120, "1AAAAAJ", 
				add10, true,18.8,
				"college", false);	
		Customer customer1 = new Customer("Pablo", "Escobar", 80, 111121, "1AAAAAK", 
				"Visa", add11, true);
		Customer customer2 = new Customer("El", "Chapito", 66, 111122, "1AAAAAL", 
				"Cash", add12, false);
		exe1.introduce();
		exe1.computePay();
		System.out.println("");
		exe2.introduce();
		exe2.computePay();
		System.out.println("");
		pth1.introduce();
		pth1.computePay(45);
		System.out.println("");
		pth2.introduce();
		pth2.computePay(35);
		System.out.println("");
		fth1.introduce();
		fth1.computePay(43);
		System.out.println("");
		fth2.introduce();
		fth2.computePay(30);
		System.out.println("");
		ch1.introduce();
		ch1.computePay(45);
		System.out.println("");
		ch2.introduce();
		ch2.computePay(35);
		System.out.println("");
		fts1.introduce();
		fts1.computePay(55);
		System.out.println("");
		fts2.introduce();
		fts2.computePay(52);
		System.out.println("");
		customer1.introduce();	
		customer1.makePayment();
		System.out.println("");
		customer2.introduce();
		customer2.makePayment();
	}
}
