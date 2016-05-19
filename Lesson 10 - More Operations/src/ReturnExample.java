/**
 * Created by scary on 4/26/2016.
 */
public class ReturnExample {

    public static void main(String[] args) {
        System.out.println((3 * add(5, 6)));
        System.out.println(concatenate("dog","cat"));
        System.out.println(evaluateTruth(true, false));
    }

    public static int add(int a, int b) {
        int aPlusB = a + b;
        return aPlusB;
    }

    public static String concatenate(String string1, String string2){
        String aPlusB = string1 + string2;
        if(evaluateTruth(true, false)) {
            return aPlusB;
        } else {
            return "I like big butts and I cannot lie";
        }
    }

    public static boolean evaluateTruth(boolean bool1, boolean bool2){
        boolean aAndB = bool1 && bool2;
        return aAndB;
    }
}