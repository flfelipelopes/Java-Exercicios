package com.learning;

import java.util.Scanner;

public class LearningVariables {

    public static void main(String[] args) {

        Scanner userName = new Scanner(System.in);
        Scanner userAge = new Scanner(System.in);
        Scanner userVerification = new Scanner(System.in);

            System.out.println("What is your name?");
            String name = userName.next();
            String surname = userName.next();

            System.out.println("What is your age?");

            int age = userAge.nextInt();

            System.out.println("Your name is " + name + " " + surname);
            System.out.println("Your ages is " + age);

            System.out.println("Is that correct? [Y/N]");
            String verification = userVerification.next();
            String check = verification.toUpperCase();
            System.out.println(check);
    }

}
