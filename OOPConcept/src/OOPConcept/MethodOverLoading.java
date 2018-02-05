package OOPConcept;

public class MethodOverLoading {

	public static void main(String[] args) {
		MethodOverLoading obj1 = new MethodOverLoading();
		obj1.sum();
		obj1.sum(10);
		obj1.sum(50,100);
		obj1.main(10001);
		//we can overload main method
		
	}
	
	public void main(int x) {
		System.out.println("THis is another main method "+x);
	}
	
//we cant create method inside another method
	//same method and same type and number of arguments are not allowed
	public void sum() {
		System.out.println("This is a method without parameters");
	}
	
	public void sum(int a) {
		System.out.println("This is method with 1 parmeter "+a);
	}
	
	public void sum(int a, int b){
		System.out.println("This is method with 2 arguments/parameters");
		System.out.println("Sum of a and b is "+(a+b));
	}
}
