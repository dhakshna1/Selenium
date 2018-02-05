
public class Car {
	String sModel;
	int iGear;
	int iHighestSpeed;
	String sColor;
	int iMake;
	boolean bLeftHandDrive;
	String sTransmission;
	int iTyres;
	int iDoors;
	
	/*public Car (String Model, int Make, boolean LeftHandDrive) {
		sModel=Model;
		iMake=Make;
		bLeftHandDrive=LeftHandDrive;
		
	}*/

	public Car () {
		sModel = "Camry";
    	iMake = 2014;
    	bLeftHandDrive = true;
	}
	

	public void DisplayCharaterisics() {
		System.out.println("Model of the car is "+sModel);
		System.out.println("Number of gears in the Car: " +  iGear);
    	System.out.println("Max speed of the Car: " +  iHighestSpeed);
    	System.out.println("Color of the Car: " +  sColor);
    	System.out.println("Make of the Car: " +  iMake);
    	System.out.println("Transmission of the Car: " +  sTransmission);
	}
}
