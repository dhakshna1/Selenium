package SubbuSession;

public class MyCalculation extends Calculation{

	public void multiply (int x, int y){
		int z=x*y;
		System.out.println("Multiplied value is "+z);
		
	}
	
	public static void main(String[] args) {
	int a=10;
	int b=30;
	MyCalculation calc = new MyCalculation();
	calc.addition(a, b);
	calc.subtaction(a, b);
	calc.multiply(a, b);
	Calculation calc1=new Calculation();
	
	}

}

class Calculation {
	int z;

	public void addition(int x, int y){
		z=x+y;
		System.out.println("Addition is "+z);
	}
	
	public void subtaction(int x, int y){
		int z;
		z=x-y;
		System.out.println("Difference is "+z);
	}
	
}