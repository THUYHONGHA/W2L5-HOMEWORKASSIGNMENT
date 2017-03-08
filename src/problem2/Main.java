package problem2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeptEmployee[] dept = new DeptEmployee[5];
		DeptEmployee prof1 = new Professor("Hong", 10000, LocalDate.parse("2045-12-20"), 10);
		DeptEmployee prof2 = new Professor("Ha", 10000, LocalDate.parse("2040-11-20"), 9);
		DeptEmployee prof3 = new Professor("Rose", 10000, LocalDate.parse("2045-12-21"), 9);
		DeptEmployee secr1 = new Secretary("Lan", 5000, LocalDate.parse("2030-12-21"), 15);
		DeptEmployee secr2 = new Secretary("Mai", 5000, LocalDate.parse("2035-10-21"), 20);
		dept[0] = prof1;
		dept[1] = prof2;
		dept[2] = prof3;
		dept[3] = secr1;
		dept[4] = secr2;
		Scanner scan = new Scanner(System.in);
		double totalSalProf = 0, totalSalSecr = 0, totalSalDept = 0;
		System.out.println(
				"Do you want to see the sum of all Professor salary, sum of all secretary salary and all salaries in the department?");
		String ans = scan.next();
		if (ans.equalsIgnoreCase("Y")) {
			for (int i = 0; i < dept.length; i++) {
				if (dept[i] instanceof Professor) {
					totalSalProf += dept[i].salary;
				}
				if (dept[i] instanceof Secretary) {
					totalSalSecr += dept[i].computeSalary();
				}
			}
			totalSalDept = totalSalProf + totalSalSecr;
			System.out.println(
					"The sum of all Professor salary is: " + totalSalProf + "\nThe sum of all secretary salary is: "
							+ totalSalSecr + "\nAll salaries in the department are: " + totalSalDept);
		}
		scan.close();
	}

}
