package OOPConcept;

public class StaticAndNonStaticConcept {
String name= "pdmoor"; //non static global variable
static int age = 39; //static global variable
	
	public static void main(String[] args) {
		//how to call static method
		sum();
		StaticAndNonStaticConcept.sum();
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		
		obj.sendMail();
		System.out.println("Global var age is "+age);
		System.out.println("Gloanl va name is "+obj.name);
		
		obj.sum();//warning for static method called by object reference
	}
	
	public void sendMail() { //non static method
		System.out.println("Send mail method");
	}
	public static void sum() { //static method
		System.out.println("Sum method");
	}

}
