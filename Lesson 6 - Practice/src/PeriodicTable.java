import java.util.Scanner;

public class PeriodicTable {

	public static void main(String[] args) {

		int hydrogen, helium, lithium, beryllium, boron, carbon, nitrogen, oxygen, flourine, neon;

		hydrogen = 1;
		helium = 2;
		lithium = 3;
		beryllium = 4;
		boron = 5;
		carbon = 6;
		nitrogen = 7;
		oxygen = 8;
		flourine = 9;
		neon = 10;

		Scanner input = new Scanner(System.in);
		int userInput = input.nextInt();

		if (userInput == hydrogen) {
			System.out.println("Hydrogen!");
		}

		if (userInput == helium) {
			System.out.println("Helium!");
		}

		if (userInput == lithium) {
			System.out.println("Lithium!");
		}

		if (userInput == beryllium) {
			System.out.println("Beryllium!");
		}

		if (userInput == boron) {
			System.out.println("Boron!");
		}

		if (userInput == carbon) {
			System.out.print("Carbon!");
		}

		if (userInput == nitrogen) {
			System.out.println("Nitrogen!");
		}

		if (userInput == oxygen) {
			System.out.println("Oxygen!");
		}

		if (userInput == flourine) {
			System.out.println("Flourine!");
		}

		if (userInput == neon) {
			System.out.println("Neon!");
		}

	}

}
