/**
 * Unit 2 Discussion Assignment
 * Give an example of a while loop, then provide the equivalent do-while and for loop.
 *
 * My program will count from 1 to 10 and sum all the numbers
 */

/**public class WhileLoop {
    public static void main(String[] args) {

        int number;     // for computing the numbers
        int counter;    // for summing the numbers up
        int newNumber;  // store the new stats of number

        number = 0;
        //counter = 0;
        newNumber = 0;

        while (number < 10) {
            number = number + 1;
            newNumber = newNumber + number;
            System.out.println(number);
            //counter = number + number;
        }

        System.out.println();
        System.out.println("The sum from 1 to 10 is equal to: ");
        System.out.print(newNumber);
        System.out.println();

    }
}*/

/**public class WhileLoop {
    public static void main(String[] args) {

        int number;     // for computing the numbers
        int newNumber;  // store the new stats of number

        number = 0;
        newNumber = 0;

        do {
            number = number + 1;
            newNumber = newNumber + number;
            System.out.println(number);
        } while (number < 10);


        System.out.println();
        System.out.println("The sum from 1 to 10 is equal to: ");
        System.out.print(newNumber);
        System.out.println();

    }
}*/

public class WhileLoop {
    public static void main(String[] args) {

        int number;     // for computing the numbers
        int newNumber;  // store the new stats of number

        newNumber = 0;


        for (number = 1; number < 11; number = number + 1) {
            System.out.println(number);
            newNumber = newNumber + number;

            }
        System.out.println();
        System.out.println("The sum from 1 to 10 is equal to: ");
        System.out.println(newNumber);
        System.out.println();
        }

    }
