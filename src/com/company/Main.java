package com.company;
//Create an application that allows the user to enter a tax rate followed by any number of prices. When the user enters a price of 0.0,
//the application should print out the list of prices entered followed by the subtotal, tax and grand total.

import java.math.RoundingMode;
import java.text.Format;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double price[] = new double[5];
        String name[] = new String[5];
        double total = 0;
        double count = 0;
        double sum = 0;
        double tax = 0;
        double grandTotal = 0;
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);
        nf.setRoundingMode(RoundingMode.HALF_DOWN);


        Scanner scan = new Scanner(System.in);


        for (int i = 0; i <5; ++i) {
            //reading the movie that user enter and assign to the array
            System.out.printf("%n Enter Name here :");
            name[i] = scan.nextLine();
            System.out.printf("%n Enter price amount here :");
            price[i] = scan.nextDouble();
            scan.nextLine();
            count++;
            sum = count + total;

            total = total + price[i];
            tax = total * 0.05;
            grandTotal = total + tax;
        }


            System.out.printf("%nNumber times %.02f  \n", count);

            System.out.printf("%nThis is the totalbefore  Tax is %.02f \n ", total);

            System.out.printf("%nTax is %.02f \n", tax);
            System.out.printf("%nGrand Total %.02f \n", grandTotal);

//            System.out.println(nf.format(grandTotal));



        for (int i = 0; i < price.length; i++) {
            //reading the movie that user enter and assign to the array
            System.out.println(name[i]);
            System.out.println(price[i]);


        }


    }


}
