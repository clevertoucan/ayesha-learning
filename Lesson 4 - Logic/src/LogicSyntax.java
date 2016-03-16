
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
		
		int poop = 2;
		int loop = 3;
		
		if(poop == loop){
//			System.out.println("poop and loop are the same!");
		} else {
//			System.out.println("Nope.");
		}
		
		String ayesha = "Aye" + "sha";
		String josh = "Ayesha";
		
		if(ayesha.equals(josh)){
			System.out.println("Same.");
		} else {
			System.out.println("they're different.");
		}
	}

}
