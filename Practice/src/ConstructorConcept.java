
public class ConstructorConcept {

	public ConstructorConcept() {
		System.out.println("Default Constructor");
	}
	public ConstructorConcept(int i) {
		System.out.println("One Constructor");
		System.out.println(i);
	}
	public ConstructorConcept(int i, String name) {
		System.out.println("Two Constructor");
		System.out.println(i);
		System.out.println(name);
	}
	
	
	public static void main(String[] args) {
		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(20,"Mani");
		
		

	}

}
