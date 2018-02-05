package OOPConcept;

public class CallByValueAndCallByReference {
	int x=100;
	int y=2000;
	public static void main(String[] args) {
		
		int i=10;
		int j=20;
		//int c;
		CallByValueAndCallByReference obj = new CallByValueAndCallByReference();
		obj.sum(i, j);
		//obj.x=100;
		//obj.y=200;
		System.out.println(obj.x+obj.y);
		
	}
	public int sum(int a, int b) {
		a=120;
		b=320;
		int c= a+b;
		System.out.println(c);
		return c;
	}
	public void swap(CallByValueAndCallByReference s) {
		int temp;
		temp=s.x;
		s.x=s.y;
		s.y=temp;
		
	}
	
}
