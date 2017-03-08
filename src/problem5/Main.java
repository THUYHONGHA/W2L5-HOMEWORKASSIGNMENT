package problem5;


public abstract class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c1=new Computer("IBM", "ADM", 4, 500, 2.7);
		Computer c2=new Computer("IBM", "Intel", 4, 500, 2.5);
		Computer c3=new Computer("IBM", "Intel", 4, 500, 2.5);		
		System.out.println(c1);
		System.out.println("Hash Code of c1: "+c1.hashCode());
		System.out.println();	
		System.out.println(c2);
		System.out.println("Hash Code of c2: "+c2.hashCode());
		System.out.println();	
		System.out.println(c2);
		System.out.println("Hash Code of c3: "+c3.hashCode());
		System.out.println();
		System.out.println("Compare c1 and c2: "+c1.equals(c2));
		System.out.println("Compare c2 and c3: "+c2.equals(c3));
		System.out.println("----------End Properties of Computer----------");
		System.out.println("Computer's power of c1: "+c1.computePower());
		System.out.println("Computer's power of c2: "+c2.computePower());
		System.out.println("Computer's power of c3: "+c3.computePower());
		
	
	}

}
