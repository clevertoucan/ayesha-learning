
//For loops are useful for when you want to run a block of code for a pre-determined number of iterations
public class ForLoopExample {

	public static void main(String[] args) {
		/*
		for(int i = 0; i < 20; i = i + 1){
			System.out.println("You have eaten "+(i + 1)+" bags of dicks.");
		}
		*/
//
		for(int i = 20 ; // runs at the start of the for loop, never runs again
				i > 0; // this is checked at the beginning of each new iteration
				i = i - 1 // this is checked at the end of each new iteration
						){
		
			System.out.println("You have eaten "+(i)+" bags of dicks.");
		
		}
		/*
		//don't ever do this
		int i = 0;
		for( ; i < 1; ){
			System.out.println("You have eaten "+(i)+" bags of dicks.");
		}
		*/
		/*
		int i = 20;
		while(i > 0){
			System.out.println("You have eaten "+(i)+" bags of dicks.");
			i = i -1;

		}
		*/
	}
}
