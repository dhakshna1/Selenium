package day1.exercises;

public class Puppy {
int puppyAge;
	public Puppy (String name) {
		System.out.println("Name is "+name);
		//int len=name.length();
		System.out.println("Length is "+name.length());
				
	}
	public void chars(String chars)
	{
		System.out.println("char is "+chars);
	}
		
	public void setAge(int age)
	{
		puppyAge=age;
	}
	
	public int getAge()
	{
		System.out.println("Puppy age is "+puppyAge);
		return puppyAge;
	}
	public static void main(String[] args) {
		
		Puppy myPuppy = new Puppy("Tommy");
		myPuppy.setAge(2);
		myPuppy.getAge();
		Puppy charPuppy = new Puppy("Barking");
		charPuppy.chars("Barking");
	
	}
}



