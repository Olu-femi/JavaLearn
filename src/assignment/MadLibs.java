package assignment;

import java.util.Scanner;

public class MadLibs {

    public static void main(String args[]){
        //1. Ask a user for the season of the year
        System.out.println("Enter a season of the year");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        //2. Ask the user to enter a whole number
        System.out.println("Enter a whole number");
        int wholeNumber = scanner.nextInt();

        //3. Ask the user to enter an adjective
        System.out.println("Enter an adjective");
        String adjective = scanner.next();
        scanner.close(); //Do this once done with user input actions

        //4. Display the statement
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + wholeNumber + " cups of coffee.");
    }
}
