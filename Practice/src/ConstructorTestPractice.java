
public class ConstructorTestPractice {

	public static void main(String[] args) {
		//Car Toyota = new Car("Camry", 2014, true);
		Car Toyota = new Car();
		Toyota.iDoors=4;
		Toyota.iGear=5;
		Toyota.iHighestSpeed=120;
		Toyota.iTyres=5;
		Toyota.sColor="Black";
		Toyota.sTransmission="Manual";
		
		Toyota.DisplayCharaterisics();
		
}
}