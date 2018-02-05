package SubbuSession;

import monday.Shape;

public class testChair {

	public static void main(String[] args) {
		Chair chair = new Chair();
		chair.legs=4;
		chair.height=120;
		System.out.println(chair.adjdustment(chair.legs, chair.height));
		chair.BrandModel("Cisco", 4);
		Employee Employee = new Employee();
		System.out.println("Employee's Net salary is " +Employee.calc(90000, 3456.70, 7650.33));
		
		Student Student = new Student();
		Student.calc(95, 65, 74, 88, 94);
		
		GreatOfThreeNum num = new GreatOfThreeNum();
		num.calc(10, 20, 15);
		
		Shape shape = new Shape();
		shape.CorrectShape(1);
		System.out.println("Shape is "+shape.CorrectShape(3));
		
		
	}

}