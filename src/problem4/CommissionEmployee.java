package problem4;

public class CommissionEmployee extends Employee {

	double grossSales;
	double commissionRate;

	CommissionEmployee(String firsName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate) {
		super(firsName, lastName, socialSecurityNumber);
		// TODO Auto-generated constructor stub
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}

	public double getPaymentAmount() {
		return getGrossSales() * getCommissionRate();
	}

	@Override
	public String toString() {
		return "First Name: " + getFirsName() + "\nLast Name: " + getLastName() + "\nSocial Security Number: "
				+ getSocialSecurityNumber() + "\nGross Sales: " + getGrossSales() + "\nCommission Rate: "
				+ getCommissionRate();
	}
}
