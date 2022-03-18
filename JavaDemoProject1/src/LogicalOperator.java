import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[]args) {
		Scanner input = new Scanner (System.in);
		char ch;
		System.out.print("Enter any letter:");
		
		ch = input.next().charAt(0);
		
		if (ch =='a'||ch =='i'||ch =='e'||ch=='o'||ch=='u') {
			System.out.print("Vowel");
	}
		else
		{
			System.out.print("Consonant");
		}

}
}
