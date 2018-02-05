package OOPConcept;

public class FunctionsInJava {

	public static void main(String[] args) {
		
		//Non-static methods
		FunctionsInJava obj1 = new FunctionsInJava();
		int l = obj1.sum();
		System.out.println("Sum is "+l);
		obj1.test();
		obj1.str();
		String s = obj1.str();
		System.out.println("Returned string is "+s);
		int d = obj1.division(40, 20);
		System.out.println("Division value is "+d);
			
	}
	public void test() {
		System.out.println("Test method");
	}
	
	public int sum() {
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}
	public String str() {
		String s = "Selenium";
		return s;
	}
	public int division(int x, int y) {
		int div= x/y;
		return div;
	}
}
