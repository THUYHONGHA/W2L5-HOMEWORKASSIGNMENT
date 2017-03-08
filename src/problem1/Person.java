package problem1;

public class Person {
	String name;
	int socSecNum;
	int age;
	String gender;
	String address;
	String phone;

	Person(String name, int socSecNum, int age, String gender, String address, String phone) {
		this.name = name;
		this.socSecNum = socSecNum;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.phone = phone;
	}
	
	Person() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSocSecNum() {
		return socSecNum;
	}

	public void setSocSecNum(int socSecNum) {
		this.socSecNum = socSecNum;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}	

	public String toString() {
		return "Name: " + getName() + "\nSocial Security Number: " + getSocSecNum() + "\nAge: " + getAge()
				+ "\nGender: " + getGender() + "\nAddress: " + getAddress() + "\nTelephone: " + getPhone();

	}

}
