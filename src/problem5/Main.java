package problem5;


public abstract class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c1=new Computer("IBM", "ADM", 4, 500, 2.5);
		Computer c2=new Computer("IBM", "Intel", 4, 500, 2.5);
		Computer c3=new Computer("IBM", "Intel", 4, 500, 2.5);
		System.out.println(c1);
		System.out.println("----------End Properties of Computer----------");
		System.out.println("Computer's power: "+c1.computePower());
		System.out.println();
		System.out.println("Compare c1 and c2: "+c1.equals(c2));
		System.out.println("Compare c2 and c3: "+c2.equals(c3));
	
	}

}
