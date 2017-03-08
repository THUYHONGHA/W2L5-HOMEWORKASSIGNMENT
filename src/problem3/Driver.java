package problem3;


public class Driver {
	
	public static void main(String[] args) {
		Figure[] fig=new Figure[5];
		Figure up1=new UpwardHat();
		Figure up2= new UpwardHat();
		Figure down= new DownwardHat();
		Figure face=new FaceMaker();
		Figure ver=new Vertical();
		fig[0]=up1;
		fig[1]=up2;
		fig[2]=down;
		fig[3]=face;
		fig[4]=ver;
		for (int i=0; i<fig.length;i++){
			fig[i].getFigure();           	
		}
		System.out.println();
		for (int i=0; i<fig.length;i++){
			System.out.print(fig[i].getClass()+": ");
	       	fig[i].getFigure();     
	       	System.out.println();
		}
		
	}

}
