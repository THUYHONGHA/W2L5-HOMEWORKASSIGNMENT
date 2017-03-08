package problem1;

public class Student extends Person {
	double fGPA;
	String major;
	int yearOfGrad;
	
	Student(String name, int socSecNum, int age, String gender, String address, String phone,double fGPA, String major, int yearOfGrad) {
		super(name, socSecNum, age, gender, address, phone);
		
		this.fGPA=fGPA;
		this.major=major;
		this.yearOfGrad=yearOfGrad;
	}

	public double getfGPA() {
		return fGPA;
	}

	public void setfGPA(double fGPA) {
		this.fGPA = fGPA;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getYearOfGrad() {
		return yearOfGrad;
	}

	public void setYearOfGrad(int yearOfGrad) {
		this.yearOfGrad = yearOfGrad;
	}

	@Override
	public String toString() {
		return "Name: " + getName() + "\nSocial Security Number: " + getSocSecNum() + "\nAge: " + getAge()
				+ "\nGender: " + getGender() + "\nAddress: " + getAddress() + "\nTelephone: " + getPhone() + "\nMajor: "
				+ getMajor() + "\nfGPA: " + getfGPA() + "\nYear of Graduation: " + getYearOfGrad();
	}

}
