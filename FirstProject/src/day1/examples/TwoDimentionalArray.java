package day1.examples;

public class TwoDimentionalArray {

public static void main(String[] args) {
	int TwoDim[][]=new int[4][3];
	
	/*TwoDim[0][1]=1;
	TwoDim[1][2]=3;
	TwoDim[2][3]=5;
	TwoDim[3][1]=10;*/
//	int i,j;
	int temp=10;
		for(int i=0; i<4;i++)
		{
			for (int j=0;j<3;j++){
				TwoDim[i][j]=temp;
				System.out.print(temp+ " ");
				temp=temp+10;
			}
			System.out.println(" ");
		}
	
	}

}
