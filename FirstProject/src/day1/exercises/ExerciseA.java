package day1.exercises;

public class ExerciseA {


	public static void main(String[] args) {
		double salary=77563.54;
		double tax=0.0;
		/*
		if (salary <= 15000)
			System.out.println("Tax is "+salary*.10);
		else if (salary<=40000)
			System.out.println("Tax is "+salary*.20);
		else if (salary<=90000)
			System.out.println("Tax is "+salary*.30);
		else
			System.out.println("Tax is "+salary*.40);*/
		
		if (salary <= 15000)
			tax=salary*.10;
		else if (salary<=40000)
			tax=salary*.20;
		else if (salary<=90000)
			tax=salary*.30;
		else
			tax =salary*.40;
			System.out.println("Tax is "+tax);	
	}

}
