
public class ConstructorWithThisKeyword {
	//Class variables
	int age;
	String name;
	
	public ConstructorWithThisKeyword(int age, String name) {
		this.name=name;
		this.age=age;
		System.out.println(age);
		System.out.println(name);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword(40,"Tiger");
	}

}
