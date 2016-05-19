/**
 * Created by josh on 5/19/16.
 */
public class Cat {
    int numberOfWhiskers;
    int numberOfTails;
    String colorOfFur;
    String name;

    public Cat(int numOfWhiskers, int numOfTails, String furColor, String catName){
        numberOfWhiskers = numOfWhiskers;
        numberOfTails = numOfTails;
        colorOfFur = furColor;
        name = catName;
    }

    public void piss(){
        System.out.println(name + " is pissing EVERYWHERE!");
    }

    public static void takeOverTheWorld(){
        System.out.println("OH THE HUMANITY! CATS EVERYWHERE! NOOOOOOOOOOOOOO!");
    }
}