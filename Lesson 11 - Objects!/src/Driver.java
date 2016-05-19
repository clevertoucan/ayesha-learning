import java.util.Scanner;

/**
 * Created by josh on 5/19/16.
 */
public class Driver {
    public static void main(String[] args){
        Cat.takeOverTheWorld();
        Cat tickles = new Cat(8, 1,"Yellow", "Tickles");
        tickles.piss();

        Scanner input = new Scanner(System.in);
        input.nextInt();
    }
}
