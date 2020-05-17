// For Loop - Exercise

/**
 * Unit 2 Discussion Assignment
 * Give an example of a for loop, then provide the equivalent while and do-while loop.
 */

/**public class ForLoop {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            System.out.println("Index " + i);
        }
    }
}*/

/**public class ForLoop {
    public static void main(String[] args) {
        int i = 0;

        while (i < 5) {
            i++;
            System.out.println("Index " + i);
        }
    }
}*/

public class ForLoop{
    public static void main(String[] args){
        int i = 0;

        do {
            i++;
            System.out.println("Index " + i);
        } while (i < 5);
    }
}