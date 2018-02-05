package day3.examples;

public class TestFamilyTree {

	public static void main(String[] args) {
		FamilyTree father=new FamilyTree();
		FamilyTree mother=new FamilyTree();
		FamilyTree brother=new FamilyTree();
		FamilyTree sister = new FamilyTree();
				
		father.salary=10000;
		father.bonus=2000;
		//father.calcuatePay();
		System.out.println("Father Salary is "+father.calcuatePay());
		
		mother.salary=8000;
		mother.bonus=1500;
		//mother.calcuatePay();
		System.out.println("Mother Salary is "+mother.calcuatePay());
		
		brother.salary=9000;
		brother.bonus=1800;
		//brother.calcuatePay();
		System.out.println("Brother Salary is "+brother.calcuatePay());
		
		sister.salary=7000;
		sister.bonus=1500;
		//sister.calcuatePay();
		System.out.println("Sister Salary is "+sister.calcuatePay());
		
		father.maximum();
		mother.maximum();
		brother.maximum();
		sister.maximum();
		
		//int a,b;
		//int tstAverage();
		//a=10;
		//b=20;
		//tstAverage(a, b);
		//System.out.println(c);
		
	}

	
}
