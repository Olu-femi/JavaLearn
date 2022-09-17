package chapter4;

/*
 * LOOP BREAK
 * Search a String to determine if it contains the letter 'A'.
 */

import java.util.Scanner;

public class LetterSearch {

    public static void main(String args[]){
        //Get text
        System.out.println("Enter some text:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;

        //Search text for letter F
        for(int i=0; i<text.length(); i++){
            char currentLetter = text.charAt(i);
            if(currentLetter == 'F' || currentLetter == 'f'){
                letterFound = true;
                break;
            }
        }

        if(letterFound){
            System.out.println("This text contains the letter 'F'");
        }
        else{
            System.out.println("This text does not contain the letter 'F'");
        }
    }
}
