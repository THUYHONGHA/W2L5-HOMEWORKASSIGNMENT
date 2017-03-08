package problem4;

public abstract class Employee implements Payable {
	String firsName;
	String lastName;
	String socialSecurityNumber;

	Employee(String firsName, String lastName, String socialSecurityNumber) {
		this.firsName=firsName;
		this.lastName=lastName;
		this.socialSecurityNumber=socialSecurityNumber;
	}

	public String getFirsName() {
		return firsName;
	}

	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	abstract public String toString();
}
