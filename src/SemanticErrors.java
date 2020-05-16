/**
 * Program to illustrate semantic errors in Java.
 */

public class SemanticErrors {
    private static final int num = 1;

    public static void main(String[] args) {
        System.out.print("You tried to print...");
        System.out.println(num);
        System.out.print("How could you mistake an integer with characters!?");
    }
}
