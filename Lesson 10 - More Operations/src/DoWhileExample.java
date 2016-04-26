/**
 * Created by scary on 4/26/2016.
 */
public class DoWhileExample {
    public static void main(String[] args){
        int x = 0;
        while(x < 5){
            System.out.print(x+",");
            x+=1;
        }
        System.out.println();
        int y = 0;
        do{
            System.out.print(y+",");
            y+=1;
        } while(y<5);

    }
}
