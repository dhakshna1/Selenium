package monday;

public class Shape {
	/*String circle;
	String line;
	String triangle;
	String sqare;
	String pentagon;*/
	//String shape;
	
	public String CorrectShape(int type)
	{
		String shape = " ";
		if (type==0){
			shape = "Circle";
		}
		if (type==1){
			shape = "line";
		}
		if (type==2){
			shape="L shape";
		}
		if (type==3){
			shape = "Triangle";
		}
		if (type==4){
			shape = "Square";
		}
		if (type==5){
			shape = "Pentagon";
		}
		return shape;
	}

}