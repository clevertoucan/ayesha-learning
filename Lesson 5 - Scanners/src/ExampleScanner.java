import java.util.Scanner;

public class ExampleScanner {

	public static void main(String[] args) {
//		String poop = "Poop";
//		int toilet = 10;
//		int flush = 50;
//		System.out.println(toilet + flush + poop);
		
		Scanner input = new Scanner(System.in);
		int userInput = input.nextInt();
		System.out.println("Josh printed out this integer: " + userInput);
		input.nextLine();
		String feces = input.nextLine();
		System.out.println("Josh printed out this String: " + feces);
		
	}
}
