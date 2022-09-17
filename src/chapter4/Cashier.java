package chapter4;

import java.util.Scanner;

/*
 * FOR LOOP:
 * Write a cashier program that will scan a given number of items and tally the cost.
 */
public class Cashier {

    public static void main(String args[]){

        //Get the number of items to scan
        System.out.println ("Enter the number of items you would love to scan");
        Scanner items = new Scanner ( System.in );

        int qty = items.nextInt ();

        float total = 0;

        //The cashier loop to scan through all the items
        /*
        int i = 0 -- initiailize the sentenal
        i < qty check the
        */
        for(int i =0; i<qty; i++){
            System.out.println ("Enter the cost of the item");
            float itemPrice = items.nextFloat ();

            total = total + itemPrice;
        }
        items.close();

        //Print out information
        System.out.println ("Your total on items purchased is: #" + total);

    }
}
