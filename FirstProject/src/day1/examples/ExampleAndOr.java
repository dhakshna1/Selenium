package day1.examples;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExampleAndOr {
@Test(priority=1)
	public static void main(String[] args) {
	
		int x,y;
		x=10;
		y=-10;
		
		if (x>0 && y>0) {
			System.out.println("POSITIVE VALUES");
		}
			else if (x>0 || y>0){
			System.out.println("ATLEAST 1 of them is postive");	
			}
			else {
				System.out.println("Both are negative");
			}
		}	
		
}
