package problem4;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payable[] obj=new Payable[5];
		Employee ce=new CommissionEmployee("Hong", "Ha", "123456789", 100, 50);
		Employee he=new HourlyEmployee("Mai", "Tran", "123987654", 20, 30);
		Employee se=new salariedEmployee("Lan", "Le", "123765489", 1000);
		Employee bce=new BasePlusCommissionEmployee("Cuc", "Nguyen", "123987456", 50, 50, 200);
		Payable inv=new Invoice("H123", "Hat", 10, 20);
		obj[0]=ce;
		obj[1]=he;
		obj[2]=se;
		obj[3]=bce;
		obj[4]=inv;
		double totalSalaries=0;
		for(Payable e: obj){
			if(e instanceof Employee)
			totalSalaries +=e.getPaymentAmount();
		}
		System.out.println(totalSalaries);
	}

}
