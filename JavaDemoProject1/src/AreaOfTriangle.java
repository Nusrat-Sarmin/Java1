import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		Double base, height, area;
		 
		System.out.print("Enter base:");
		base= input.nextDouble();
		
		System.out.print("Enter height:");
		height=input.nextDouble();
		
		area=.5*base*height;
		System.out.println("Area of Triangle:"+area);
	
		
		
	}

}
