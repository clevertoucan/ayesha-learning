/**
 * Created by scary on 4/26/2016.
 */
public class ReturnExample {

    public static void main(String[] args){
        System.out.println( (3 * add(5,6)) );
    }

    public static int add(int a, int b){
        int aPlusB = a + b;
        return aPlusB;
    }
}
