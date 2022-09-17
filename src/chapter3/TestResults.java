package chapter3;

import java.util.Scanner;

public class TestResults {
    public static void main(String args[]){
        //Get Test score
        System.out.println("Enter your test score");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();

        //Determine the grade
        char grade;
        if(score <= 49){
            grade = 'F';
        } else if (score <= 59) {
            grade = 'D';
        } else if (score <= 69) {
            grade = 'C';
        } else if (score <= 74) {
            grade = 'B';
        } else {
            grade = 'A';
        }

        System.out.println("Your grade is " + grade);
    }
}
