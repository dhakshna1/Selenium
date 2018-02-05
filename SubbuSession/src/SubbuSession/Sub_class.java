package SubbuSession;

public class Sub_class extends Super{
	int a = 10;
	public void display(){
		System.out.println("You are inside the Sub Class. a Value is "+a);
	}
	public static void main(String[] args) {
		Sub_class sub = new Sub_class();
		Super sup = new Super();
		sub.display();
		sup.display();
	}
}
class Super{
	int a=20;
	public void display(){
		System.out.println("You are Inside the Super Class. a Value is "+a);
	}
}
