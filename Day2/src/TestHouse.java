
public class TestHouse {

	public static void main(String[] args) {
	
		//object of house class
		House h1 = new House();
		House h2 = new House();
		House h3 = new House();
		h1.houseNumber=100;
		h2.houseNumber=200;
		h3.houseNumber=300;
		
		System.out.println(h1.houseNumber);
		System.out.println(h2.houseNumber);
		System.out.println(h3.houseNumber);
		
		h1=h2;
		System.out.println(h1.houseNumber);
		System.out.println(h2.houseNumber);
		System.out.println(h3.houseNumber);

	}

}
