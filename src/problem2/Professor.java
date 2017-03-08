package problem2;

import java.time.LocalDate;

public class Professor extends DeptEmployee {
	int numberOfPublications;

	public Professor(String name, double salary, LocalDate hireDate, int numberOfPublications) {
		super(name, salary, hireDate);
		// TODO Auto-generated constructor stub
		this.numberOfPublications = numberOfPublications;
	}

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}
}
