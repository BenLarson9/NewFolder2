
package com.example;

import java.util.Scanner;



public class SquareRootWhile {
    public static void main(String args[])
    {
    System.out.print("Type a non-negative integer: "
       + "\nP.S., an integer is any whole number.\n" );
     Scanner console = new Scanner(System.in);
	int number = console.nextInt();

        
    while (number < 0){
            System.out.println("Invalid number, try agian.");
            number = console.nextInt();
    }
     
    
    System.out.println("The Sqaure Root of " + number 
            + " is: " + Math.sqrt(number) );
    }
    
}
