package com.example.java;

public class Main {
    public static void main(String[] args) {
        //write your code here

        char[] myName = {'F', 'E', 'L', 'I', 'P', 'E'
        };
        System.out.println(myName[0]); // prints the char related to the index

        String i = "four";
        String message = i.equals("one") ? "There is a tree." : "There are " + i + " trees.";
        System.out.println(message); // trick for plural or singular answers

        String name = new String(myName);
        System.out.println(name); // convert char to String

        char bubble = name.charAt(0);
        System.out.println(bubble); // convert String to char

        
    }
}
