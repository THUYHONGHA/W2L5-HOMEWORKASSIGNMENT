package problem1;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {	
	
		float annualSalary;
		
		SalariedEmployee(String name, int socSecNum, int age, String gender, String address, String phone,
				String department, String jobTitle, LocalDate dateOfHire, float annualSalary) {
			super(name, socSecNum, age, gender, address, phone, department, jobTitle, dateOfHire);
			// TODO Auto-generated constructor stub
			this.annualSalary=annualSalary;
		}

		

		public float getAnnualSalary() {
			return annualSalary;
		}

		public void setAnnualSalary(float annualSalary) {
			this.annualSalary = annualSalary;
		}
		@Override
		public String toString() {
			return "Name: " + getName() + "\nSocial Security Number: " + getSocSecNum() + "\nAge: " + getAge()
					+ "\nGender: " + getGender() + "\nAddress: " + getAddress() + "\nTelephone: " + getPhone()
					+ "\nDepartment: " + department + "\nJob Title: " + getJobTitle() + "\nDate of Hire: "
					+ getDateOfHire()+"\nAnnual Salary: "+getAnnualSalary();
		}
	
}
