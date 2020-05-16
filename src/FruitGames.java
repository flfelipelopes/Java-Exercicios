import javax.swing.*;

/**
 * Exercise using the if statement
 */

public class FruitGames {
    public static void main(String[] args) {
        String answer = JOptionPane.showInputDialog("What is the pineapple colour?");
        answer = answer.toUpperCase();


        if (answer.equals("YELLOW")) {
           JOptionPane.showMessageDialog(null, "CORRECT!");
        }

        else {
            JOptionPane.showMessageDialog(null, "WRONG!!!!");

        }

    }
}
