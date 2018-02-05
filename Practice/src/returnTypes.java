import java.util.Random;

public class returnTypes {

	int i;
	int j;
	
	public void show() {
		int a;
		int b;
		String s;
		System.out.println("This is show method");
	}
	public int display(int i, String a, String s, double d, boolean b) {
		//i=10;
		//int j=100;
		System.out.println("Inside display method");
		System.out.println(i+a+s+d+b);
		return i;
		
	}
	public static void main(String[] args) {
		returnTypes r= new returnTypes();
		r.show();
		r.display(10, "Test", "a", 34.66, true);
		int num = (int)(Math.random()*4);
		System.out.println(num);
		// TODO Auto-generated method stub
		//display(20);
	}

}
