package SubbuSession;

public class Chair {

	int height;
	int legs;
	int handle;
	String Brand;
	
	int adjdustment(int height, int legs){
		int totalHeight=height*legs;
		return totalHeight;
	}
	void BrandModel(String Brand, int handle){
		System.out.println("Brand is "+Brand+ " and handle is "+handle);
	}
}
