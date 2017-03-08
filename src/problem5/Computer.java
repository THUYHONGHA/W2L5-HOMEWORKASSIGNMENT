package problem5;

public class Computer implements Cloneable {
	String manufacturer;
	String processor;
	int ramSize;
	int diskSize;
	double processorSpeed;

	public Computer(String manufacturer, String processor, int ramSize, int diskSize, double processorSpeed) {
		this.manufacturer = manufacturer;
		this.processor = processor;
		this.ramSize = ramSize;
		this.diskSize = diskSize;
		this.processorSpeed = processorSpeed;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public int getRamSize() {
		return ramSize;
	}

	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}

	public int getDiskSize() {
		return diskSize;
	}

	public void setDiskSize(int diskSize) {
		this.diskSize = diskSize;
	}

	public void setProcessorSpeed(double processorSpeed) {
		this.processorSpeed = processorSpeed;
	}

	public double getProcessorSpeed() {
		return processorSpeed;
	}

	public double computePower() {
		return getRamSize() * getProcessorSpeed();
	}

	public String toString() {
		return "Manufacturer: " + getManufacturer() + "\nProcessor: " + getProcessor() + "\nRam Size: " + getRamSize()
				+ "\nDisk Size: " + getDiskSize() + "\nProcessor Speed: " + getProcessorSpeed();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Computer c = (Computer) obj;
		if (c.manufacturer.equals(this.manufacturer) && c.processor.equals(this.processor) && c.ramSize == this.ramSize && c.diskSize == this.diskSize
				&& c.processorSpeed == this.processorSpeed) {
			return true;
		} 
		return false;
	}

	@Override
	public int hashCode() {
		int hash =(int)Double.doubleToLongBits(processorSpeed);
		hash=(int)(hash^(hash>>>32));		
		hash = hash * manufacturer.hashCode() + 5 * processor.hashCode() + (int)ramSize*(int)diskSize;
		return hash;
	}

	// used for problem 6
	public Object clone() throws CloneNotSupportedException {
		Computer com = (Computer) super.clone();
		return com;
	}

}
