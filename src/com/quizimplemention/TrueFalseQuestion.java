package com.quizimplemention;

import javax.swing.JOptionPane;

public class TrueFalseQuestion extends Question {

    @Override
    String ask() {
        while (true){
            String answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();

            // Verifies if the answer is valid or not
            if (answer.equals("FALSE") || (answer.equals("F") || (answer.equals("NO") || (answer.equals("N"))))){
                //Changes the valid answer into "FALSE"
                return "FALSE";
            }
            else if (answer.equals("TRUE") || (answer.equals("T") || (answer.equals("YES") || (answer.equals("Y"))))){
                //Changes the valid answer into "TRUE"
                return "TRUE";
            }else {
                //Message for invalid inputs by the user
                JOptionPane.showMessageDialog
                        (null,"Invalid answer. Please enter TRUE or FALSE");
            }
        }
    }

    TrueFalseQuestion (String question, String answer) {
        this.question = "TRUE or FALSE: " + question;
        correctAnswer = answer;
    }
}
