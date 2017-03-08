package problem4;

public class BasePlusCommissionEmployee extends CommissionEmployee {

	double baseSalary;

	BasePlusCommissionEmployee(String firsName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate, double baseSalary) {
		super(firsName, lastName, socialSecurityNumber, grossSales, commissionRate);
		// TODO Auto-generated constructor stub
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public double getPaymentAmount() {
		return getBaseSalary() + (getGrossSales() * getCommissionRate());
	}

	@Override
	public String toString() {
		return "First Name: " + getFirsName() + "\nLast Name: " + getLastName() + "\nSocial Security Number: "
				+ getSocialSecurityNumber() + "\nGross Sales: " + getGrossSales() + "\nCommission Rate:"
				+ getCommissionRate() + "\nBase Salary: " + getBaseSalary();
	}
}
