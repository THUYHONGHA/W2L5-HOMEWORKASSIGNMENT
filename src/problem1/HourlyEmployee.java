package problem1;

import java.time.LocalDate;

public class HourlyEmployee extends Employee{
	float hourlyRate;
	float hourWorked;
	float unionDues;
	HourlyEmployee(String name, int socSecNum, int age, String gender, String address, String phone,
			String department, String jobTitle, LocalDate dateOfHire, float hourlyRate, float hourWorked, float unionDues) {
		super(name, socSecNum, age, gender, address, phone, department, jobTitle, dateOfHire);
		// TODO Auto-generated constructor stub
		this.hourlyRate=hourlyRate;
		this.hourWorked=hourWorked;
		this.unionDues=unionDues;
	}
	

	public float getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(float hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public float getHourWorked() {
		return hourWorked;
	}

	public void setHourWorked(float hourWorked) {
		this.hourWorked = hourWorked;
	}

	public float getUnionDues() {
		return unionDues;
	}

	public void setUnionDues(float unionDues) {
		this.unionDues = unionDues;
	}
	
	@Override
	public String toString() {
		return "Name: " + getName() + "\nSocial Security Number: " + getSocSecNum() + "\nAge: " + getAge()
				+ "\nGender: " + getGender() + "\nAddress: " + getAddress() + "\nTelephone: " + getPhone()
				+ "\nDepartment: " + department + "\nJob Title: " + getJobTitle() + "\nDate of Hire: "
				+ getDateOfHire()+"\nHourly Rate: "+getHourlyRate()+"\nHour Worked: "+ getHourWorked()+"\nUnion Dues: "+getUnionDues();
}
}
