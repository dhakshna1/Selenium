package SubbuSession;

public class Student {

	int ta=10;
	int eng;
	int maths;
	int bio;
	int ss;
	
	void calc(int ta, int eng, int maths, int bio, int ss)
	{
		int tot = ta+eng+maths+bio+ss;
		double ave=tot/2;
		System.out.println("Student's Total mark is "+tot);
		System.out.println("Average is "+ave);
		
	}
}
