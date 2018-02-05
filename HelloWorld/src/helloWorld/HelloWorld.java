package helloWorld;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

class HelloWorld {
	@Test
    public static void main(String[] args) {
	        System.out.println("Hello World!"); // Display the string.
	        byte x;
	        int a=270;
	        double b=200.200;
	        System.out.println("int converted to byte");
	        x=(byte) a;
	        System.out.println("a and x "+a+"  "+x);
	        System.out.println("Double converted to int");
	        a=(int) b;
	        System.out.println("a and b "+a+"  "+b);
	        ArrayDemo();
	        Sample_String();
	       
    }
@Test
public static void ArrayDemo() 
	{
		int array[] = new int[7];
    	for (int count=0;count<7;count++)
    {
    	array[count]=count+1;
    }
    	for (int count=0;count<7;count++)
   		{
       System.out.println("array["+count+"] = "+array[count]);
   		}
    
  }
@Test
public static void Sample_String()
	{
	 //String Concatenation
	String str1 = "Rock";
	String str2 = "Star";
	String str3 = "Welcome";
	String strTest  = "100";
	//Method 1 : Using concat
	str3 = str1.concat(str3);
	System.out.println(str3);
	//Method 2 : Using "+" operator
	String str4 = str1 + str2;
	System.out.println(str4);
	System.out.println("Index of character S is :"+str4.indexOf('S'));
	System.out.println("Character at psition of 6 is " + str4.charAt(6));
	System.out.println("Compare to ROCKSTAR to "+str4.compareTo("Rockstar"));
	System.out.println("Compare to 'ROCKSTAR' - Case Ignored "+str4.compareToIgnoreCase("Rock"));
	System.out.println("Contain seqence 'tar' "+str4.contains("tar"));
	System.out.println("Ends with 'r' "+str4.endsWith("r"));
	System.out.println("Replace Rock with 'Duck' "+str4.replace("Rock", "Duck "));
	System.out.println("Upper case of RockStar "+str4.toUpperCase());
	System.out.println("Lower case of RockStar "+str4.toLowerCase());
	int iTest= Integer.parseInt(strTest)/4;
	System.out.println(iTest);
	}
@BeforeTest
public static void testPrint(){
	System.out.println("This is test message");
}
}
