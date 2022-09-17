package chapter3;

import java.util.Scanner;

public class GradeMessage {

    public static void main(String args[]){
        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        String message;

        switch(grade){
            case "A":
                message = "Excellent";
                break;
            case "B":
                message = "Very good";
                break;
            case "C":
                message = "Good";
                break;
            case "D":
                message = "Better luck next time";
                break;
            case "F":
                message = "Oops! you didn't make the cut";
                break;
            default:
                message = "Error! invalid grade";
                break;
        }

        System.out.println(message);
    }
}
