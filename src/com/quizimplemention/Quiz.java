package com.quizimplemention;

public class Quiz {
    public static void main(String[] args){
        Question question = new MultipleChoiceQuestion(
                "What's the pineapple color? \n",
                "Black\n",
                "Purple\n",
                "Red\n",
                "Yellow\n",
                "Gray\n",
                "D");
        question.check();

        Question question2 = new MultipleChoiceQuestion(
                "Why the logo of Java programming language is a cup of coffee?\n",
                "Because Java compiles so fast that you can enjoy the free time with a cup of coffee.\n",
                "The name was randomly picked after a meeting among the developers and their lawyers.\n",
                "For a homage to the Java island, where the most expensive coffees are produced.\n",
                "Because most of Java workers enjoyed drinking coffee in a nearby cafe.\n",
                "Because the Java developers decided the name while drinking a cup of Java coffee.\n",
                "B");
        question2.check();

        Question question3 = new MultipleChoiceQuestion(
                "What was the first programming language ever?\n",
                "Autocode - developed by Alick Glennie\n",
                "Fortran - developed by John Backus\n",
                "Algorithm for the Analytical Engine - developed by Ada Lovelace\n",
                "COBOL - developed by Dr. Grace Murray Hopper\n",
                "C - developed by Dennis Ritchie\n",
                "C");
        question3.check();

        Question question4 = new MultipleChoiceQuestion(
                "What was the first brand in the world to release a mobile phone?\n",
                "Nokia - in 1971\n",
                "Motorola - in 1973\n",
                "Samsung - in 1965\n",
                "Apple - in 1961\n",
                "LG Electronics - in 1962\n",
                "B");
        question4.check();

        Question question5 = new MultipleChoiceQuestion(
                "When was the first functional computer invented?\n",
                "Z1 - created in 1936\n",
                "Macintosh - created in 1984\n",
                "IBM Aptiva - created in 1994\n",
                "Kenbak-1 - created in 1971\n",
                "ENIAC 1 - created in 1946\n",
                "A");
        question5.check();

        Question question6 = new TrueFalseQuestion(
                "Is Java considered a strongly-typed language.\n",
                "TRUE");
        question6.check();

        Question question7 = new TrueFalseQuestion(
                "In an instance method or a constructor .this is a reference to the current object.\n",
                "TRUE");
        question7.check();

        Question question8 = new TrueFalseQuestion(
                "Garbage Collection is manual process.\n",
                "FALSE");
        question8.check();

        Question question9 = new TrueFalseQuestion(
                "Constructor overloading is not possible in Java.\n",
                "FALSE");
        question9.check();

        Question question10 = new TrueFalseQuestion(
                "Variables in Java can be used without being first declared.\n",
                "FALSE");
        question10.check();

        MultipleChoiceQuestion.showResults();
    }
}
