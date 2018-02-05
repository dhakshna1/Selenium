package day1.examples;

public class ExampleString {

	public static void main(String[] args) {
	String x="Hello, Dhakshna Moorthy";
	System.out.println("Hello "+x);
	System.out.println(x.toUpperCase());
	System.out.println(x.substring(7));
	System.out.println(x.substring(0,7));
	System.out.println(x.charAt(3));
	String age = "38";
	String Salary="77563.00";
	
	int a = Integer.parseInt(age)+2;
	System.out.println(a);
	
	double b=Double.parseDouble(Salary)*15;
	System.out.println(b);
	double b1=b/a;
	System.out.println(b1);

	}

}
