package br.com.userdata;

public class Student {
    public String name;     //Student's name
    public double test1, test2, test3;      //Grades on three tests

    public double getAverage() { // compute average test grade
        return (test1 + test2 + test3) / 3;
    }
}//end of class Student
