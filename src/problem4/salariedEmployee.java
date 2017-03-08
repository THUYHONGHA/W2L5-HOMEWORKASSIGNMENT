package problem4;

public class salariedEmployee extends Employee {
	double weeklySalary;

	salariedEmployee(String firsName, String lastName, String socialSecurityNumber, double weeklySalary) {
		super(firsName, lastName, socialSecurityNumber);
		// TODO Auto-generated constructor stub
		this.weeklySalary = weeklySalary;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	public double getPaymentAmount() {
		return getWeeklySalary();
	}

	@Override
	public String toString() {
		return "First Name: " + getFirsName() + "\nLast Name: " + getLastName() + "\nSocial Security Number: "
				+ getSocialSecurityNumber() + "\nWeekly Salary: " + getWeeklySalary();
	}
}
