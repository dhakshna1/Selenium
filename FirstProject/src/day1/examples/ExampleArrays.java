package day1.examples;

public class ExampleArrays {

	public static void main(String[] args) {
	int[] a={10,20,30,40,50};
	System.out.println(a[2]+ " "+a[4]);
	for (int temp:a){
		System.out.println(temp);
	
	}
	System.out.println("=============");
	int[] x = new int[5];
	x[2]=30;
	x[4]=50;
	
	for(int temp1: x){
			System.out.println(temp1);
	}
	String[] st={"One","Two","Three","Four", "Five"};
	for (String temp2: st)
		System.out.println(temp2);
	String[] st1=new String[5];
	st1[2]="25";
	st1[3]="12";
			for (String temp3: st1)
				System.out.println(temp3);
}
}