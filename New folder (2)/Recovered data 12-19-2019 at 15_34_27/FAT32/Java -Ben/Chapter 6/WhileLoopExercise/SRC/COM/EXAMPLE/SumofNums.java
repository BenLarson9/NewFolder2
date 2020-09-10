package com.example;

import java.util.Scanner;

public class SumofNums {

    public static void main(String args[]) {
        
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number (-1 to quit): "); 
        int sum = 0;
        int number = console.nextInt();

        
        do { if(number == -1){break;}
            sum = sum + number;     // moved to top of loop
            System.out.print("Enter a number (-1 to quit): ");
            number = console.nextInt();}
        while (number != -1);
            
        

        System.out.println("The sum is " + sum);

    }
}

