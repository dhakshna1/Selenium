
public class B extends A {

	public B() {
		super(10,"Tiger");
		System.out.println("Child class constructor");
	}

	public static void main(String[] args) {
		B obj = new B();

	}

}
