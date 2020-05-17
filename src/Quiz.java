//Quiz - Exercise

import javax.swing.JOptionPane;

public class Quiz {

    public static void main(String[] args) {

        while (true) {
            String question = "A. red\n";
            question += "B. purple\n";
            question += "C. black\n";
            question += "D. brown\n";
            question += "E. yellow\n";


                String answer = JOptionPane.showInputDialog("What is the pineapple color?\n" + question);
                answer = answer.toUpperCase();

                if (answer.equals("E")) {
                    JOptionPane.showMessageDialog
                            (null, "CORRECT!");
                    break;
                }
                if (!answer.equals("A") && (!answer.equals("B") && (!answer.equals("C") && (!answer.equals("D"))))) {
                    JOptionPane.showMessageDialog
                            (null, "Invalid answer. Please try again.");
                } else {
                    JOptionPane.showMessageDialog
                            (null, "Your answer is not correct. Let us try again.");
                }
            }

        }
    }