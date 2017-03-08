package problem6;

import problem5.Computer;

public class Person implements Cloneable {
	String name;
	Computer computer;

	Person(String name, Computer computer) {
		this.name = name;
		this.computer = computer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Computer getComputer() {
		return computer;
	} 

	public void setComputer(Computer computer) {
		this.computer = computer;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Person p = (Person) super.clone();
		return p;
	}

	@Override
	public String toString() {
		return "Name: " + this.name + "\nManufacture: " + this.computer.getManufacturer() + "\nProcessor: "
				+ this.computer.getProcessor() + "\nRam Size: " + this.computer.getRamSize() + "\nDisk Size: "
				+ this.computer.getDiskSize() + "\nProcessor Speed: " + this.computer.getProcessorSpeed();
	}
}
