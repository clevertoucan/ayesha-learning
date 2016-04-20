/*
 * Make a method called scanPrint with no parameters to scan in 20 different strings (use a loop) from user input 
 * and concatenate them into one string.
 * Once you have the string, print it out.
 * (Hint: to make a method, use the same syntax as the main method below.)
 */
import java.util.Scanner;

public class EverythingWeveLearned {

	public static void main(String[] args) {
		scanPrint();
	}

	public static void scanPrint() {

		int bark = 1;

		String dog = "";
		Scanner input = new Scanner(System.in);

		while(bark < 20) {

			bark = bark + 1;
			String userInput2 = input.nextLine();
			System.out.print("Blah " + userInput2);


		}
	}
}