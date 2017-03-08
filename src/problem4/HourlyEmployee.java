package problem4;

public class HourlyEmployee extends Employee {
	double wage;
	double hours;

	HourlyEmployee(String firsName, String lastName, String socialSecurityNumber, double wage, double hours) {
		super(firsName, lastName, socialSecurityNumber);
		// TODO Auto-generated constructor stub
		this.wage = wage;
		this.hours = hours;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public double getPaymentAmount() {
		return getWage() * getHours();
	}

	@Override
	public String toString() {
		return "First Name: " + getFirsName() + "\nLast Name: " + getLastName() + "\nSocial Security Number: "
				+ getSocialSecurityNumber() + "\nWage: " + getWage() + "\nHours: " + getHours();
	}
}
