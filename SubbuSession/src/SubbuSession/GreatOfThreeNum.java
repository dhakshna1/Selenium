package SubbuSession;

public class GreatOfThreeNum {
	int a;
	int b,c;
	
	void calc(int a, int b, int c){
		if (a>b && a>c)
		{
			System.out.println("A is greatest");
			
		}
		else if (b>a && b>c){
			System.out.println("B is greatest");
		}
		else
			System.out.println("C is createst");
	}
	
}
