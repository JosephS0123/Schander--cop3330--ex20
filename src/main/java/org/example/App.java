/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joseph Schander
 */
package org.example;



import java.text.DecimalFormat;
import java.util.Scanner;

public class App
{

    public static void main( String[] args )
    {
        int Total = 0;
        DecimalFormat DF = new DecimalFormat("##.##");
        String County =" ";
        Scanner uInput = new Scanner(System.in);
        System.out.println("Please enter the state it will be shipped");
        String State = uInput.nextLine();
        if(State.equals("Wisconsin")){
            System.out.println("What county will it be shipped to?");
             County = uInput.nextLine();
        }
        System.out.println( "What is the order amount?" );
        double Amount = uInput.nextInt();
        double Tax = 0.00;
        if(State.equals("Wisconsin")){
            Tax += .05;
        }
        if(County.equals("Eau Claire")){
            Tax += .005;
        }
        if (County.equals("Dunn")){
            Tax += .004;
        }
        if(State.equals("Illinois")){
        Tax += .080;
        }
        System.out.println("The tax is $"+DF.format(Tax * Amount) + "\nThe total is $"+DF.format((Tax *Amount) + Amount));


    }
}
