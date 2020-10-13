package testPackage;


import java.io.IOException;
import java.util.Scanner;

public class Shapes {
	int d1;
	int d2;
	int area ;
	
	public int shapeArea() throws IOException {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Shape number If Square enter 1 else enter 2");
		int shapeName = s.nextInt();
		if (shapeName == 1) {
			System.out.println("Enter Square one Dimension");
			 d1 = s.nextInt();
			area = d1 * d1 ;
		}
		else
		{
			System.out.println("Enter shape two Dimension");
			 d1 = s.nextInt();
			 d2 = s.nextInt();
			area = d1 * d2 ;
			
		}
		return area;
	}
	

}
