
public class LogicSyntax {

	public static void main(String[] args) {
		boolean var = false;
		boolean foo = true;
		
		if((var || foo) && var){
//			System.out.println("This is true.");
		} else {
//			System.out.println("nope.");
		}
		if( ((!(var && foo)) && foo) ){
//			System.out.println("This is false.");
		}
		
		if((var ^ foo) ^ foo){
			System.out.println("This code is executing");
		}
		
//		Practice with the numeric boolean expressions
		int poop = 2;
		int loop = 3;
		
		if(poop != loop){
//			System.out.println("poop and loop are different!");
		} else {
//			System.out.println("Poop and loop are the same.");
		}
		
		if((poop > loop) || (poop == loop)){
//			System.out.println("poop is less than or equal to loop.");
		}
		if(poop >= loop){
//			System.out.println("poop is less than or equal to loop.");
		}
		
		String ayesha = "Aye" + "sha";
		String josh = "Josh";
		
		if(!ayesha.equals(josh)){
//			System.out.println("Josh and Ayesha are different (I'm shocked)");
		} else {
//			System.out.println("they're the same.");
		}
	}

}
