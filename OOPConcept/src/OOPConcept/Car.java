package OOPConcept;

public class Car {
	int model;
	int wheel;
	
	public static void main(String[] args) {
		//Car class
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		a.model=2010;
		a.wheel=4;
		
		b.model=2011;
		b.wheel=4;
		
		c.model=2001;
		c.wheel=5;
		
		System.out.println(a.model);
		System.out.println(a.wheel);
		System.out.println(b.model);
		System.out.println(b.wheel);
		System.out.println(c.model);
		System.out.println(c.wheel);
		System.out.println("***********************");
		a=b;
		b=c;
		c=a;
		System.out.println(a.model);
		System.out.println(a.wheel);
		System.out.println(b.model);
		System.out.println(b.wheel);
		System.out.println(c.model);
		System.out.println(c.wheel);
		
	}

}
