//QuizTwo - Exercise

import javax.swing.*;

public class QuizTwo {

    static int nQuestions = 0;                     // The number of games played.
    static int nCorrect = 0;                        // The number of games won.

    static String ask(String question) {

        while (true){
            String answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();

            boolean valid = (answer.equals("A") || (answer.equals("B") ||
                    (answer.equals("C") || (answer.equals("D") || (answer.equals("E"))))));

            if (valid) return answer;

            JOptionPane.showMessageDialog(null,
                    "Invalid answer. Please insert A, B, C, D, or E.");
        }
    }
    static void check(String question, String correctAnswer){
        nQuestions++;
        String answer = ask(question);

        if (answer.equals(correctAnswer)){
            JOptionPane.showMessageDialog(null,"Correct!");
            nCorrect++;
        }else {
            JOptionPane.showMessageDialog(null,
                    "Incorrect. The correct answer is " + correctAnswer + ".");
        }
    }

    public static void main(String[] args){
        String question = "What's the pineapple color? \n";
        question += "A. Black\n";
        question += "B. Purple\n";
        question += "C. Red\n";
        question += "D. Yellow\n";
        question += "E. Gray\n";

        check(question,"D");

        question = "Why the logo of Java programming language is a cup of coffee?\n";
        question+= "A. Because Java compiles so fast that you can enjoy the free time with a cup of coffee.\n";
        question+= "B. The name was randomly picked after a meeting among the developers and their lawyers.\n";
        question+= "C. For a homage to the Java island, where the most expensive coffees are produced.\n";
        question+= "D. Because most of Java workers enjoyed drinking coffee in a nearby cafe.\n";
        question+= "E. Because the Java developers decided the name while drinking a cup of Java coffee.\n";

        check(question,"B");

        question = "What was the first programming language ever?\n";
        question+= "A. Autocode - developed by Alick Glennie\n";
        question+= "B. Fortran - developed by John Backus\n";
        question+= "C. Algorithm for the Analytical Engine - developed by Ada Lovelace\n";
        question+= "D. COBOL - developed by Dr. Grace Murray Hopper\n";
        question+= "E. C - developed by Dennis Ritchie\n";

        check(question,"C");

        JOptionPane.showMessageDialog(null,
                nCorrect + " correct out of " + nQuestions + " questions.");
    }
}