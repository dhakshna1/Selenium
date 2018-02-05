package SubbuSession;

public class Employee {
	int gross;
	double pf;
	double tax;
		
	double calc(int gross, double pf, double tax){
		double netSalary=(gross)-(pf+tax);
		return netSalary;
	}
	
}
