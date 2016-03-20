
public class Driver {

	public static void main(String[] args) {
		printRandomThings();
		MethodExample.getStatus();

	}

	public static void printRandomThings(){
		System.out.println("Hello there!");
		System.out.println("My name is Josh!");
		System.out.println("How are you today?");
	}
	
	public static void printRandomThing(String randomThing){
		System.out.println(randomThing);
	}
}