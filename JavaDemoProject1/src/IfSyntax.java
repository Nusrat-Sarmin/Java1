import java.util.Scanner;

public class IfSyntax {

	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		int num;
		
		System.out.print("Enter any integer:");
		
		num = input.nextInt();
		
		if(num>0) {
			System.out.println("Positive");
		}
	}

}
