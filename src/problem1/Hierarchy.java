package problem1;

import java.time.LocalDate;

public class Hierarchy extends Person {

	public static void main(String[] args) {
		Person[] per = new Person[4];
		Person std = new Student("Hong Ha", 123456789, 34, "Female", "abc Street", "123-123456", 4.0,
				"Computer Science", 2017);
		Person e = new Employee("Mai", 123987654, 25, "Female", "abcd Street", "987-123455", "Sale Department",
				"Faculty", LocalDate.parse("2030-12-02"));
		Person he = new HourlyEmployee("Tam", 123789456, 35, "Male", "abc Street", "123-678932", "IT Department",
				"Technical Support", LocalDate.parse("2020-12-12"), 50, 100, 10);
		Person se = new SalariedEmployee("Lan", 123097876, 37, "Female", "xyz Street", "123-6785468",
				"Accounting Department", "Accountant", LocalDate.parse("2020-10-12"), 10000);
		per[0]=std;
		per[1]=e;
		per[2]=he;
		per[3]=se;
		for(int i=0; i<per.length;i++){
			System.out.println(per[i].toString());
			System.out.println("\n");
		}
		
	}
}
