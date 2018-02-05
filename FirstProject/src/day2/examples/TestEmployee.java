package day2.examples;

public class TestEmployee {

public static void main(String[] args) {
//Employee alex, linda, john;
	/*alex=new Employee();
	linda=new Employee();
	john=new Employee();*/
	Employee alex=new Employee();
	Employee linda=new Employee();
	Employee john=new Employee();
	
	alex.salary=90000;
	alex.bonus=20000;
	alex.CalculateTotalPay();
	
	linda.salary=110000;
	linda.bonus=20000;
	linda.CalculateTotalPay();
	
	john.salary=85000;
	john.bonus=5000;
	john.CalculateTotalPay();
	}

}
