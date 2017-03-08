package problem1;

import java.time.LocalDate;

public class Employee extends Person {
	Employee(String name, int socSecNum, int age, String gender, String address, String phone, String department,
			String jobTitle, LocalDate dateOfHire) {
		super(name, socSecNum, age, gender, address, phone);
		// TODO Auto-generated constructor stub
		this.department = department;
		this.jobTitle = jobTitle;
		this.dateOfHire = dateOfHire;
	}
	

	String department;
	String jobTitle;
	LocalDate dateOfHire;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public LocalDate getDateOfHire() {
		return dateOfHire;
	}

	public void setDateOfHire(LocalDate dateOfHire) {
		this.dateOfHire = dateOfHire;
	}

	@Override
	public String toString() {
		return "Name: " + getName() + "\nSocial Security Number: " + getSocSecNum() + "\nAge: " + getAge()
				+ "\nGender: " + getGender() + "\nAddress: " + getAddress() + "\nTelephone: " + getPhone()
				+ "\nDepartment: " + department + "\nJob Title: " + getJobTitle() + "\nDate of Hire: "
				+ getDateOfHire();
	}
	
}
