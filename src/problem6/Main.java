package problem6;

import problem5.Computer;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		// Shallow copy of Cloning assign the objects instance references 
		Person p=new Person("Thinkpad", new Computer("IBM", "Intel", 4, 500, 2.5));
		System.out.println("Shallow copy");
		System.out.println("Before cloning: ");
		System.out.println("Source: \n" +p);
		System.out.println();
		Person p1=(Person)p.clone();
		System.out.println("After cloning: ");
		System.out.println("Clone: \n"+p1.clone());
		
		System.out.println();
		System.out.println("Change some things on the source");		
		p.computer.setManufacturer("Lenovo");
		System.out.println("After modifying the name");
		System.out.println("Source:\n"+p);
		System.out.println();
		System.out.println("Clone:\n"+p1);		
		System.out.println("------------------------------------------------------");
		
		
		// Deep copy of Cloning copy the objects instance references
		PersonDeepCopy pdc=new PersonDeepCopy("Inspiron", new Computer("DELL", "Intel", 4, 500, 2.5));
		System.out.println();
		System.out.println("Deep copy");
		System.out.println("Before cloning");
		System.out.println("Source: \n"+pdc);
		System.out.println();
		
		PersonDeepCopy pdc1=(PersonDeepCopy)pdc.clone();
		System.out.println("After cloning");
		System.out.println("Clone: \n"+pdc1.clone());
		
		System.out.println();
		System.out.println("After modifying the name and Ram Size");		
		pdc.computer.setRamSize(8);	
		pdc.computer.setProcessor("ADM");
		System.out.println("Source:\n"+pdc);
		System.out.println();
		System.out.println("Clone:\n"+pdc1);	
		
		
	}

}
