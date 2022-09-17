package assignment;

import java.util.Scanner;

public class ChangeForAThousandNaira {
    public static void main(String args[]){

        int ten_naira = 10;
        int twenty_naira = 20;
        int fifty_naira = 50;
        int hundred_naira = 100;

        int thousand_naira = 1000;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to 'Change for a Thousand naira note'"
                            + " You are to enter enough changed to make #1000.00");

        System.out.println("How many #10 do you have?");
        int numberOfTens = scanner.nextInt();

        System.out.println("How many #20 do you have?");
        int numberOfTwenties = scanner.nextInt();

        System.out.println("How many #50 do you have?");
        int numberOfFifties = scanner.nextInt();

        System.out.println("How many #100 do you have?");
        int numberOfHundreds = scanner.nextInt();

        scanner.close();

        int total = numberOfTens * ten_naira + numberOfTwenties * twenty_naira + numberOfFifties * fifty_naira +
                            numberOfHundreds * hundred_naira ;

        if(total < thousand_naira){
            int amountShort = thousand_naira - total;

            System.out.println("Hello there, seems you are short " + amountShort + " naira");
        }
        else if (total >thousand_naira) {
            int amountOver = total-thousand_naira;

            System.out.println("Hello there, seems you are in excess of " + amountOver + " naira");
        }
        else{
            System.out.println("Great you got exactly a thousand naira. Here is your #1000 note!");
        }
    }
}
