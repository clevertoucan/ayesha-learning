import java.util.Date;

// While loops are useful when you want to run something until a certain event happens
public class WhileLoopExample {

	public static void main(String[] args) {
//		System.out.println("Hi there!");
//		System.out.println("Hi there!");
//		System.out.println("Hi there!");
//		System.out.println("Hi there!");
//		System.out.println("Hi there!");
//		System.out.println("Hi there!");
		
		/*
		boolean keepGoing = true;
		Date then = new Date();
		
		while(keepGoing == true){
			Date now = new Date();
			long difference = now.getTime() - then.getTime();
			System.out.println("You have been looping for "+ difference +"milliseconds");
			if(difference > 1000){
				keepGoing = false;
			}
		}
		*/
		
		int increment = 0;
		
		/*
		while(increment < 10){
			System.out.println("This loop has run "+increment+" times.");
			increment = increment + 1;
			
		}
		*/
		
		
		while(increment < 20){
			System.out.print("You have eaten "+(increment + 1)+" bags of dicks.");
			increment = increment + 1; 
		}
		
		
		
		
	}

}
