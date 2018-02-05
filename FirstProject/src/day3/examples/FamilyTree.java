package day3.examples;

public class FamilyTree {

	double salary;
	double bonus;
	double tax;
	double net;
	
	public double calcuatePay(){
		net=(bonus+salary)-tax;
		//System.out.println("Net Salary is "+net);
		return net;
	}
	
	public void maximum() {
		net=(bonus+salary)-tax;
		if (net>10000)
			System.out.println("Maximum salary");
		else
			System.out.println("Minimum slary");
	}
	
	public int tstAverage(int x,int y){
		int c;
		c=x+y;
		return(c);
	}
	
	
			
	
}
