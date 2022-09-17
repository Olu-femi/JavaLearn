package chapter4;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String args[]){

        Scanner scanner = new Scanner (System.in );

        boolean again;
        do{
            System.out.println ("Enter the first number");
            double num1 = scanner.nextDouble ();

            System.out.println ("Enter the second number");
            double num2 = scanner.nextDouble ();

            double sum = num1 + num2;

            System.out.println ("The sum of the 1st and 2nd number is " + sum);

            System.out.println("Would you like to start over?");
            again = scanner.nextBoolean(); //Using the sentenal to help control the flow of the loop

        }while (again);

        scanner.close ();
    }
}
