//The 3N Problem

/**
 * The 3N + 1 Problem
 * 1 - Ask for a positive integer (N);
 * 2 - If (N) is even then (N / 2);
 * 3 - If (N) is odd then ((N * 3) + 1);
 * 4 - Until (N) == 1
 */

public class The3NProblem {

    public static void main(String[] args) {
        int N;          // for computing terms in the sequence
        int counter;    // for computing the terms

        System.out.println("Please insert a positive number: -35 ");
        N = -35;
        while (N <= 0) {
            System.out.println("It must be a positive number. Please try again: 984 ");
            N = 984;
        }
        // At this point we know that N > 0

        counter = 0;
        while (N != 1) {
            if (N % 2 == 0)     // Checks for even numbers
                N = N / 2;
            else
                N = 3 * N + 1;
            System.out.println(N);
            counter = counter + 1;
        }

        System.out.println();
        System.out.print("There were ");
        System.out.print(counter);
        System.out.println(" terms in the sequence.");

    } // end of main
} // end of The3NProblem
