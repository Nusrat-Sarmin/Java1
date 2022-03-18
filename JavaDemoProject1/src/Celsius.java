import java.util.Scanner;

public class Celsius {

	public static void main(String[]args) {
      Scanner input = new Scanner(System.in);
		
		double Cels, farn;
		
		System.out.print("Farenheit=");
		
		farn = input.nextDouble();
		
		Cels = .56*farn-32;
		
		System.out.print("Celsius="+Cels);
	}

}
