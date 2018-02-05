
public class A {

	public A() {
		System.out.println("Parent class constructor");
	}
	public A(int i) {
		System.out.println("Parent class constructor with parameter "+i);
	}
	public A(int i, String name) {
		System.out.println("Parent class constructor with parameter "+i);
		System.out.println("Parent class constructor with parameter "+name);
	}
}
