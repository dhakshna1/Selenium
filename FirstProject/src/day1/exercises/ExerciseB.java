package day1.exercises;

public class ExerciseB {

	public static void main(String[] args) {
		
		String[] nums={"10","20","30","40","50"};
		int total=0;
		
		for(String temp:nums)
		{
			//total=total+Integer.parseInt(temp);
			total+=Integer.parseInt(temp);
		}
		System.out.println("Total value is "+total);
		
	}

}
