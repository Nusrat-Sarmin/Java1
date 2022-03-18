import java.util.Scanner;

public class Fahrenheit {

	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		double Cels, farn;
		
		System.out.print("Celcius=");
		
		Cels = input.nextDouble();
		
		farn = 1.8*Cels+32;
		
		System.out.print("Farenheit="+farn);
	}

}
